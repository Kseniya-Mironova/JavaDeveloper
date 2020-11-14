package com.javastudy.homework4.task1.zoo.animal;

public class Lion extends Animal {

    public Lion(){

    }

    public Lion(String name) {
       super(name);
    }

    @Override
    public void say(){
        System.out.println("Ррр");
    }

    public void leavePhePride(){
        System.out.println("Лев покинул прайд");
    }

    public void relax(){
        System.out.println("Лев отдохнул");
    }
}
