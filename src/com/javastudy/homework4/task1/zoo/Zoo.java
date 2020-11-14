package com.javastudy.homework4.task1.zoo;

import com.javastudy.homework4.task1.zoo.animal.*;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Гоша");
        Cat cat = new Cat("Маша");
        Dog dog = new Dog("Рекс");
        Lion lion = new Lion("Симбо");
        Zebra zebra = new Zebra("Алиса");

        bear.say();
        bear.eat();

        cat.walk();
        cat.sharpenClaws();

        lion.relax();
    }
}
