package com.javastudy.homework5.zoo.exceptions;

public class DistanceException extends Exception {

    String name;

    public DistanceException(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
