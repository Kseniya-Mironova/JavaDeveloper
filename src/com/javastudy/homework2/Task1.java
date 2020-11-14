package com.javastudy.homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //вводим исходные данные для формирования строки с рамкой
        System.out.println("Ведите ширину рамки");
        int width = scan.nextInt();

        System.out.println("Введите высоту рамки");
        int height = scan.nextInt();

        System.out.println("Введите текстовую строку");
        String string = scan.next();

        System.out.println("\nРезультат:");

        //нарисуем рамку вокруг строки
        if (string.length() < width - 1 && height > 2) {

            //половина от ширины
            int halfWidth = (width - string.length()) / 2;
            //половина от высоты
            int halfHeight = (height - 1) / 2;

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    if ((i == 0) || (j == 0) || (i == height - 1) || (j == width - 1))
                        System.out.print("*");
                    else if (i == halfHeight && j == halfWidth) {
                        System.out.print(string);
                        j += string.length() - 1;
                    } else
                        System.out.print(" ");
                }

                System.out.println("");
            }
       //в случае, если длина строки не позволяет вписать строку в рамку заданного размера,
       //выведем сообщение об ошибке
        } else
            System.out.println("Ошибка");
    }
}

