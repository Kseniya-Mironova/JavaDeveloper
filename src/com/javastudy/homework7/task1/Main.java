package com.javastudy.homework7.task1;

import com.javastudy.homework5.zoo.animal.*;
import com.javastudy.homework6.aviary.*;

public class Main {

    public static void main(String[] args) {

        Aviary aviary1 = new Aviary();
        Aviary aviary2 = new Aviary();
        Aviary aviary3 = new Aviary();
        Aviary aviary4 = new Aviary();

        Aviaries aviaries = new Aviaries();

        aviaries.addAviary(1, aviary1);
        aviaries.addAviary(2, aviary2);
        aviaries.addAviary(3, aviary3);
        aviaries.addAviary(4, aviary4);

        aviaries.addAnimalInAviary(1, new Lion("Симбо"));
        aviaries.addAnimalInAviary(2, new Dog("Рекс"));
        aviaries.addAnimalInAviary(3, new Cat("Люся"));
        aviaries.addAnimalInAviary(4, new Cat("Бабс"));
    }
}
