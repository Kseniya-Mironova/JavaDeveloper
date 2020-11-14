package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.interfaces.*;

public class Dog extends Animal implements InterfaceForDog {

    public Dog(){

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака покушала");
    }

    @Override
    public void walk() {
        System.out.println("Собака погуляла");
    }

    public void gnawABone(){
        System.out.println("Собака погрызла косточку");
    }

    public void guardTheHouse(){
        System.out.println("Собкака посторожила дом");
    }
}
