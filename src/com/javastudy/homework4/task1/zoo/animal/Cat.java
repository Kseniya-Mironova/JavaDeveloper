package com.javastudy.homework4.task1.zoo.animal;

public class Cat extends Animal {

    public Cat(){

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Мяу");
    }

    public void sharpenClaws(){
        System.out.println("Кошка наточила когти");
    }

    public void lick(){
        System.out.println("Кошка вылизалась");
    }
}
