package com.javastudy.homework7.task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {

    public static void main(String[] args) {

        Player player1 = new Player(1, true, "***");
        Player player2 = new Player(2, false, "***");

        var history = new HashSet<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходное слово:");
        var originalWord = scanner.nextLine();

        var letters = getChars(originalWord);

        while (!player1.getInputWord().isBlank() || !player2.getInputWord().isBlank()) {
            if (player1.isTurn()) {
                play(player1, letters, history);
                player1.setTurn(false);
                player2.setTurn(true);
            }
            else if(player2.isTurn()) {
                play(player2, letters, history);
                player2.setTurn(false);
                player1.setTurn(true);
            }
        }

        System.out.println("Игра окончена, счет " + player1.getPoint() + ":" + player2.getPoint());
    }

    public static void play(Player player, Set<Character> letters, HashSet<String> history) {

        System.out.println("Игрок №" + player.getNumber() + ", ваша очередь...");

        System.out.println("Какое слово состоит из букв исходного?");
        Scanner scanner = new Scanner(System.in);
        var inputWord = scanner.nextLine();

        if (!inputWord.isBlank()) {

            var inputLetters = getChars(inputWord);

            if (!isContainsAll(letters, inputLetters)) {
                System.out.println("Ответ неверный, данное слово не состоит из букв исходного!");
            } else if (history.contains(inputWord)) {
                System.out.println("Данное слово уже было введено ранее!");
            } else {
                System.out.println("Слово засчитано!");
                player.addPoint(inputWord.length());
                history.add(inputWord);
            }
        }

        player.setInputWord(inputWord);
    }

    public static Set<Character> getChars(String word) {
        var letters = new HashSet<Character>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        return letters;
    }

    public static boolean isContainsAll(Set<Character> first, Set<Character> second){
        for (var item: second) {
            if (!first.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
