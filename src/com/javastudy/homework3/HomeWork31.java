//1. (с помощью рекурсии) Написать функцию, которая проверяет, является ли слово палиндромом.
//   Палиндром - это слово, читающееся в обоих направлениях одинаково. Например, "топот", "доход".
//   Для получения символа из строки используйте:
//
//   String a = "топот";
//   var symbol = a.charAt(0); // первая буква

package com.javastudy.homework3;

public class HomeWork31 {

    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        }

        char firstSymbol = str.charAt(0);
        char lastSymbol = str.charAt(str.length() - 1);

        if (firstSymbol == lastSymbol) {
            String subStr = str.substring(1, str.length() - 1);
            return isPalindrome(subStr);
        }

        return false;
    }

    public static void main(String[] args) {
        var a = "топот";

        System.out.println(isPalindrome(a));
    }
}
