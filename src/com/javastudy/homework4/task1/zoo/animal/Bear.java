package com.javastudy.homework4.task1.zoo.animal;

public class Bear extends Animal {

    public Bear(){

    }

    public Bear(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Уууа");
    }

    public void hibernate(){
        System.out.println("Медведь впал в спячку");
    }

    public void swim(int meters){
        System.out.println("Медведь проплыл " + meters + " метров");
    }
}
