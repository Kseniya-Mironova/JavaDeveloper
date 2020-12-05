package com.javastudy.homework13.task3;

import java.io.*;

public class Wc {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);

        long lines = linesCount(file);
        long words = wordsCount(file);
        long bytes = bytesCount(file);

        System.out.println(lines + " " + words + " " + bytes + " " + file.getName());
    }

    //Подсчет количества строк
    public static long linesCount (File file) throws IOException {

        try (BufferedReader bufferedReader = new LineNumberReader(new FileReader(file))) {
            long lines = 0;
            while (bufferedReader.readLine() != null) {
                lines++;
            }
            return lines;
        }
    }

    //Подсчет количества слов
    public static long wordsCount (File file) throws IOException {

        long words = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) {
                String[] array = bufferedReader.readLine().split(" ");
                words += array.length;
            }
            return words;
        }
    }

    //Подсчет количества байт
    public static long bytesCount (File file) {
        return file.length();
    }
}

