package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.exceptions.*;

public abstract class Animal {
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

    public abstract void say();

    public abstract void eat();

    public abstract void walk();

    public void play(String toy) throws ToyException {

        if(!toy.equals("мяч") && !toy.equals("пуллер") && !toy.equals("сумасшедшее яйцо")){
            throw new ToyException("Данной игрушки нет в зоопраке или введенный параметр не является игрушкой");
        }

        String result = "Животное поиграло в " + toy;
        System.out.println(result);
    }

    public void play(String toy1, String toy2) throws ToyException {

        if(!toy1.equals("мяч") && !toy1.equals("пуллер") && !toy1.equals("сумасшедшее яйцо")){
            throw new ToyException("Данной игрушки нет в зоопраке или введенный параметр не является игрушкой");
        }

        if(!toy2.equals("мяч") && !toy2.equals("пуллер") && !toy2.equals("сумасшедшее яйцо")){
            throw new ToyException("Данной игрушки нет в зоопраке или введенный параметр не является игрушкой");
        }

        String result = "Животное поиграло в " + toy1 + " и в " + toy2;
        System.out.println(result);
    }

}
