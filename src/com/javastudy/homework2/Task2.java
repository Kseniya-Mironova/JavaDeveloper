package com.javastudy.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //считываем с клавиатуры к-й символ строки и переводим его в число
        System.out.println("Введите искомый индекс строки");
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();

        //определим коэффициент, который будет использоваться для расчета к-го символа строки
        //(1 - если к<=8, 2 - если k<=188, 3 - если k<=2888, 4 - если к <= 38888 и т.д.)
        long rank = 1;

        //определим число, исходя из которого будет рассчитываться rank
        //(8, 188, 2888, 38888 и т.д.)
        long point = -1;

        while ((point += 9 * (rank * Math.pow(10, (rank-1)))) < k) {
            rank++;
        }

        //определим приращение до числа
        long increment = 0;

        long i = 0, j = 0;
        while (i < rank - 1) {
            j += Math.pow(10, i) * 9;
            increment += j;
            i++;
        }

        //рассчитаем символ строки по заданному индексу к
        long symbol = 0;

        long tempOne = (increment + k) / rank + 1;
        long tempTwo = (tempOne * rank - increment) - k;

        i = 1;
        while (i <= tempTwo) {
            symbol = tempOne % 10;
            tempOne = (tempOne - symbol) / 10;
            i++;
        }

        System.out.println("Полученный символ строки");
        System.out.println(symbol);
    }
}


