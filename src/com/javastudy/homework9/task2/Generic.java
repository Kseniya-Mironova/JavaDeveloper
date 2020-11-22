/*(Generics) Напишите общий метод для подсчета количества элементов в коллекции,
которые имеют определенное свойство (например, нечетные целые числа, простые числа, палиндромы).
Данное свойство реализовать через функциональный интерфейс, который возвращает true/false
в зависимости от принадлежности к свойству или нет.*/

package com.javastudy.homework9.task2;

import java.util.ArrayList;

@FunctionalInterface
interface ParityCheckFunction<T> {
    boolean parityCheck(T a);
}

public class Generic {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(9);

        var count = 0;

        var parityCheckFunction = (ParityCheckFunction)(a -> (int)a % 2 == 0 ? true : false);

        for (Integer value : arrayList) {
            if (parityCheckFunction.parityCheck(value)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
