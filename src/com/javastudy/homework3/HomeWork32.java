//2. Написать функцию, которая убирает одинаковые значения из списка.
//   1 1 1 1 2 2 3 4 5
//   Результат программы:
//   1 2 3 4 5

package com.javastudy.homework3;

import java.util.ArrayList;

public class HomeWork32 {

    public static void removeDuplicates(ArrayList<Integer> myList){

        System.out.println("До");
        for (var item : myList){
            System.out.print(item + " ");
        }

        for (int i = myList.size() - 1; i > -1; i--) {
            if (myList.indexOf(myList.get(i)) != i)
                myList.remove(i);
        }

        System.out.println("\nПосле");
        for (var item : myList){
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        removeDuplicates(myList);
    }
}
