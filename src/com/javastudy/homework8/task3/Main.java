package com.javastudy.homework8.task3;

public class Main {
    public static void main(String[] args) {

        Integer[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        Matrix matrix = new Matrix(array);

        for (Integer element : matrix) {
            System.out.println(element);
        }
    }
}
