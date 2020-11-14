package com.javastudy.homework5.zoo.exceptions;

public class ToyException extends Exception {

    String name;

    public ToyException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
