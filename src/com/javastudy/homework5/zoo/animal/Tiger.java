package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.interfaces.*;

public class Tiger extends Animal implements InterfaceForTiger {

    public Tiger(){

    }

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Аррр");
    }

    @Override
    public void eat() {
        System.out.println("Тигр покушал");
    }

    @Override
    public void walk() {
        System.out.println("Тигр погулял");
    }

    public void hunt(){
        System.out.println("Тигр сходил на охоту");
    }

    public void joinTheFray(){
        System.out.println("Тигр вступил в схватку с чужаком");
    }
}
