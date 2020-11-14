//3. (на массивы) Написать функцию, которая переворачивает массив, размерностью 8.
//    Например,
//    8 7 6 5 4 3 2 1
//    Результат программы:
//    1 2 3 4 5 6 7 8

package com.javastudy.homework3;


public class HomeWork33 {

    public static void arrayReverse(int[] array) {

        System.out.println("До");
        for (var item : array){
            System.out.print(item + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        System.out.println("\nПосле");
        for (var item : array){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {

        var array = new int[] {8, 7, 6, 5, 4, 3, 2, 1};

        arrayReverse(array);
    }
}
