package com.javastudy.homework8.task1;

import java.util.ArrayDeque;
import java.util.HashMap;

public class PostfixNotation {

    public static void main(String[] args) {

        String infix = "3+4*2/(1 - 5)^2";

        if (infix.contains("+") || infix.contains("-") || infix.contains("*")
                || infix.contains("/") || infix.contains("^")) {
            System.out.println(reversePolish(infix));
        } else {
            System.out.println("Ошибка");
        }
    }

   static String reversePolish(String infix){
       char[] infixSymbols = infix.toCharArray();

       StringBuilder postfix = new StringBuilder();

       ArrayDeque<Character> arrayDeque = new ArrayDeque<>();

       HashMap<Character, Integer> priorities = new HashMap<>();
       priorities.put('(', 4);
       priorities.put(')', 4);
       priorities.put('+', 3);
       priorities.put('-', 3);
       priorities.put('/', 2);
       priorities.put('*', 2);
       priorities.put('^', 1);


       for (char symbol : infixSymbols) {

           if (Character.isAlphabetic(symbol) || symbol == '(') {
               arrayDeque.addLast(symbol);
           }
           else if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '^') {
                while ((arrayDeque.peekLast() != null
                        && Character.isLetter(arrayDeque.peekLast()))
                        || (priorities.containsKey(arrayDeque.peekLast())
                        && priorities.get(arrayDeque.peekLast()) <= priorities.get(symbol))) {

                        postfix.append(arrayDeque.pollLast());
                    }

               arrayDeque.addLast(symbol);
           }
          else if (symbol == ')') {
               while (arrayDeque.peekLast() != null && arrayDeque.peekLast() != '(') {
                   postfix.append(arrayDeque.pollLast());
               }
           }
          else if (Character.isDigit(symbol)) {
               postfix.append(symbol);
           }
       }

       while (arrayDeque.peekLast() != null) {
           if (arrayDeque.peekLast() != '(') {
               postfix.append(arrayDeque.pollLast());
           } else {
               arrayDeque.pollLast();
           }
       }

       return postfix.toString();
   }
}