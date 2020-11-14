package com.javastudy.homework4.task1.zoo.animal;

public class Dog extends Animal {

    public Dog(){

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Гав");
    }

    public void gnawABone(){
        System.out.println("Собака погрызла косточку");
    }

    public void guardTheHouse(){
        System.out.println("Собкака посторожила дом");
    }
}
