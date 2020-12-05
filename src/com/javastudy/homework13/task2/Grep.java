package com.javastudy.homework13.task2;

import java.io.*;

public class Grep {
    public static void main(String[] args) {

        File file = new File(args[1]);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;

            while (bufferedReader.ready()){

                line = bufferedReader.readLine();

                if (line.contains(args[0]))
                    System.out.println(line);

            }
        } catch (IOException e) {

            System.out.println("Не удается найти указанный файл");
        }
    }
}
