package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.interfaces.*;

public class Lion extends Animal implements InterfaceForLion {

    public Lion(){

    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Ррр");
    }

    @Override
    public void eat() {
        System.out.println("Лев покушал");
    }

    @Override
    public void walk() {
        System.out.println("Лев погулял");
    }

    public void leavePhePride(){
        System.out.println("Лев покинул прайд");
    }

    public void relax(){
        System.out.println("Лев отдохнул");
    }
}

