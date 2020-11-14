package com.javastudy.homework4.task1.zoo.animal;

public class Zebra extends Animal {

    public Zebra(){

    }

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Ухху");
    }

    public void feedTheCub(){
        System.out.println("Зебра покормила детеныша");
    }

    public void avoidPursuit(){
        System.out.println("Зебра спаслась от преследования охотника");
    }
}
