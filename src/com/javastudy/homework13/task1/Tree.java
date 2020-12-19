package com.javastudy.homework13.task1;

import java.io.File;

public class Tree {

    public static void main(String[] args) {

        File file = new File(args[0]);

        if (!file.isDirectory()) {
            System.out.println("Невозможно отобразить дерево, т.к. неверно указан каталог.");
        } else {
            getTree(file);
        }
    }

    static void getTree(File directory) {
        System.out.println(directory.getAbsolutePath());
        StringBuilder symbols = new StringBuilder();
        getTree(directory, symbols);
    }

    static void getTree(File directory, StringBuilder symbols) {
        File[] files = directory.listFiles();

        assert files != null;
        if (files.length != 0) {

            for (int i = 0; i < files.length - 1; i++) {
                System.out.print(symbols.toString());
                System.out.print("╟─");
                System.out.println(files[i].getName());
                if (files[i].isDirectory()) {
                    getTree(files[i], symbols.append("║ "));
                }
            }

            System.out.print(symbols.toString());
            System.out.print("╙─");
            System.out.println(files[files.length - 1].getName());

            if (files[files.length - 1].isDirectory()) {
                getTree(files[files.length - 1], symbols.append("  "));
            }
        }

        if (symbols.length() >= 2)
            symbols.setLength(symbols.length() - 2);
    }
}

