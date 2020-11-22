package com.javastudy.homework7.task3;

public class Player {

    private int number;  //номер
    private int point;   //количество очков
    private String inputWord;  //слово, которое ввел игрок
    boolean turn;  //очередь игрока


    public Player(int number, boolean turn, String inputWord) {
        this.number = number;
        this.turn = turn;
        this.inputWord = inputWord;
    }

    public int getNumber() {
        return number;
    }

    public int getPoint() {
        return point;
    }

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void addPoint(int points) {
        this.point += points;
    }
}
