package com.javastudy.homework9.task1;

import java.util.Comparator;

public class MyIntegerComparator implements Comparator<MyInteger> {

    private int getCountOfPrimeDivisors(int value) {

        int count = 0;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                if (isPrime(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int divisor) {
        for (int i = 2; i < divisor; i++) {
            if (divisor % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public int compare(MyInteger o1, MyInteger o2) {
        return Integer.compare(getCountOfPrimeDivisors(o1.getValue()), getCountOfPrimeDivisors(o2.getValue()));
    }
}
