package com.javastudy.homework6.exceptions;

public class LimitException extends Exception {

    String name;

    public LimitException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
