package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.interfaces.*;

public class Cat extends Animal implements InterfaceForCat {

    public Cat(){

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка покушала");
    }

    @Override
    public void walk() {
        System.out.println("Кошка погуляла");
    }

    public void sharpenClaws(){
        System.out.println("Кошка наточила когти");
    }

    public void lick(){
        System.out.println("Кошка вылизалась");
    }
}
