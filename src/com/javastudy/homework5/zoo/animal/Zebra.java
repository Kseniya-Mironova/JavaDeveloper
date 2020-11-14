package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.interfaces.*;

public class Zebra extends Animal implements InterfaceForZebra {

    public Zebra(){

    }

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Ухху");
    }

    @Override
    public void eat() {
        System.out.println("Зебра покушала");
    }

    @Override
    public void walk() {
        System.out.println("Зебра погуляла");
    }

    public void feedTheCub(){
        System.out.println("Зебра покормила детеныша");
    }

    public void avoidPursuit(){
        System.out.println("Зебра спаслась от преследования охотника");
    }
}
