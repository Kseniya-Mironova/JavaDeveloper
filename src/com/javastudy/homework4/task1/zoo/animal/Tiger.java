package com.javastudy.homework4.task1.zoo.animal;

public class Tiger extends Animal {

    public Tiger(){

    }

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Аррр");
    }

    public void hunt(){
        System.out.println("Тигр сходил на охоту");
    }

    public void joinTheFray(){
        System.out.println("Тигр вступил в схватку с чужаком");
    }
}
