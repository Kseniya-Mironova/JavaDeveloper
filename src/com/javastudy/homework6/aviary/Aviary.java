package com.javastudy.homework6.aviary;

import com.javastudy.homework5.zoo.animal.*;
import com.javastudy.homework6.exceptions.*;

import java.util.ArrayList;

public class Aviary {

   ArrayList<Animal> aviary = new ArrayList<>();

    public Aviary() {
    }

    public void addAnimal(Animal animal) {
        try {

            findDuplicate(animal);
            aviary.add(animal);
            checkAviaryLength();
        }
        catch (DuplicateException ex) {
            System.out.println(ex.getName());
        }
        catch (LimitException ex) {
            System.out.println(ex.getName());
        }
    }

    public void removeAnimal(Animal animal) {
        int index = 0;

        for(int i = 0; i < aviary.size(); i++) {
            if (aviary.get(i).equals(animal)) {
                index = i;
                break;
            }
        }
        aviary.remove(index);
    }

    public void findDuplicate(Animal animal) throws DuplicateException {

        for (Animal value : aviary) {
            if (value.equals(animal)) {
                throw new DuplicateException("Данное животное уже добавлено в вольер");
            }
        }
    }

    public void checkAviaryLength() throws LimitException {
        if (aviary.size() > 5)
            throw new LimitException("Невозможно добавить животное в вольер, т.к. он заполнен");
    }

    public ArrayList<Animal> getAviary() {
        for (Animal animal : aviary) System.out.println(animal.getName());
        return aviary;
    }
}
