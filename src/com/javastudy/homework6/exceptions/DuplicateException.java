package com.javastudy.homework6.exceptions;

public class DuplicateException extends Exception {

    String name;

    public DuplicateException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
