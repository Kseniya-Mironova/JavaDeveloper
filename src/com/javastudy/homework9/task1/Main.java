//(Компаратор) Класс целых чисел с порядком на основе количества простых делителей.

package com.javastudy.homework9.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var arrayList = new ArrayList<MyInteger>();
        arrayList.add(new MyInteger(30));
        arrayList.add(new MyInteger(10));
        arrayList.add(new MyInteger(13));
        arrayList.add(new MyInteger(9));

        arrayList.sort(new MyIntegerComparator());

        for (var item: arrayList) {
            System.out.println(item.getValue());
        }
    }
}
