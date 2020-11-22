package com.javastudy.homework7.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходное слово:");
        var originalWord = scanner.nextLine();

        var letters = getChars(originalWord);

        var history = new HashSet<String>();

        var point = 0;

        System.out.println("Какое слово состоит из букв исходного?");
        var inputWord = scanner.nextLine();

        while (!inputWord.isBlank()){

            var inputLetters = getChars(inputWord);

            if (!isContainsAll(letters, inputLetters)) {
                System.out.println("Ответ неверный, данное слово не состоит из букв исходного!");
            } else if (history.contains(inputWord)) {
                System.out.println("Вы уже вводили данное слово!");
            } else {
                System.out.println("Слово засчитано!");

                history.add(inputWord);
                point += inputWord.length();
            }

            System.out.println("Какое слово состоит из букв исходного?");
            inputWord = scanner.nextLine();
        }

        System.out.println("Игра окончена, счет " + point);
    }

     public static Set<Character> getChars(String word) {
        var letters = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        return letters;
     }

     public static boolean isContainsAll (Set<Character> first, Set<Character> second){
        for (var item: second) {
            if (!first.contains(item)) {
                return false;
            }
        }
        return true;
     }
}
