package com.javastudy.homework4.task1.zoo.animal;

public class Animal {
    String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("");
    }

    public void eat(){
        System.out.println("Животное покушало");
    }

    public void walk(){
        System.out.println("Животное погуляло");
    }

}
