package com.javastudy.homework6;

import com.javastudy.homework5.zoo.animal.*;
import com.javastudy.homework6.aviary.*;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear("Гоша");
        Cat cat = new Cat("Маша");
        Dog dog = new Dog("Рекс");
        Lion lion = new Lion("Симбо");
        Zebra zebra = new Zebra("Алиса");

        Cat cat1 = new Cat("Васька");
        Dog dog1 = new Dog("Кира");

        Aviary aviary = new Aviary();

        aviary.addAnimal(bear);
        aviary.addAnimal(bear);
        aviary.addAnimal(cat);
        aviary.addAnimal(dog);
        aviary.addAnimal(lion);
        aviary.addAnimal(zebra);
        aviary.addAnimal(cat1);

        aviary.getAviary();
        System.out.println("");

        aviary.removeAnimal(zebra);
        aviary.removeAnimal(lion);

        aviary.getAviary();
        System.out.println("");
    }
}
