package com.javastudy.homework7.task1;

import com.javastudy.homework5.zoo.animal.*;
import com.javastudy.homework6.aviary.*;
import com.javastudy.homework6.exceptions.*;

import java.util.HashMap;

public class Aviaries {

    private HashMap<Integer, Aviary> aviaries = new HashMap<>();

    public Aviaries() {

    }

    public void addAviary(int number, Aviary aviary) {
        try {

            checkAviariesLength();
            aviaries.put(number, aviary);
            System.out.println("Добавлен вольер №" + number);
        }

        catch (LimitException ex) {
            System.out.println(ex.getName());
        }
    }

    public void addAnimalInAviary(int number, Animal animal) {
        try {
            aviaries.get(number).addAnimal(animal);
            System.out.println("В вольер №" + number + " добавлено животное по имени " + animal.getName());
        }
        catch (NullPointerException ex) {
            System.out.println("Невозможно добавить животное в вольер, т.к. вольера с таким номером не существует");
        }
    }

    public void checkAviariesLength() throws LimitException {
        if (aviaries.size() > 2)
            throw new LimitException("Невозможно добавить вольер, т.к. достигнуто их максимальное количество");
    }

}
