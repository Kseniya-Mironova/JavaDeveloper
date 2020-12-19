package com.javastudy.homework4.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibsys {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ведите число:");
        int number = scan.nextInt();

        ArrayList<Integer> myList = new ArrayList<>();

        cekendorfSum(number, myList);

        for (int i = myList.get(0); i > 0; i--) {

            if (!myList.contains(i))
                System.out.print(0);
            else
                System.out.print(1);
        }
    }

    static int fibonacci(int number){
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    static int getPosition(int fibNum){
        int number = 2;
        while (fibNum > fibonacci(number)){
            fibonacci(++number);
        }
        return --number;
    }
    static void cekendorfSum(int number, ArrayList<Integer> myList){

        if (number <= 0){
            return;
        }
        int fibNum = 0;  int fibNumPrev = 0;

        for (int i = 1; fibNum <= number; i++){
            fibNumPrev = fibNum;
            fibNum = fibonacci(i);
        }
        myList.add(getPosition(fibNumPrev));

        cekendorfSum(number - fibNumPrev, myList);
    }
}
