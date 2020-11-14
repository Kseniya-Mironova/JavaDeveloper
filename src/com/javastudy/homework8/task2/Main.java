
//(Итератор) последовательность целых чисел с итератором по цифрам десятичного
// представления чисел  (в обратном направлении)
// Дополнительно: в прямом направлении.

package com.javastudy.homework8.task2;

import com.javastudy.homework8.task2.iterators.*;

public class Main {
    public static void main(String[] args) {

        var numbers1 = new ReverseDirection(123456789);
        var numbers2 = new ForwardDirection(123456789);

        System.out.println("Прямой порядок");
        for (Integer element : numbers2) {
            System.out.println(element);
        }

        System.out.println("Обратный порядок");
        for (Integer element : numbers1) {
            System.out.println(element);
        }
    }
}
