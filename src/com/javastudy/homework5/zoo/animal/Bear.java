package com.javastudy.homework5.zoo.animal;

import com.javastudy.homework5.zoo.exceptions.*;
import com.javastudy.homework5.zoo.interfaces.*;

public class Bear extends Animal implements InterfaceForBear {

    public Bear(){

    }

    public Bear(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.println("Уууа");
    }

    @Override
    public void eat() {
        System.out.println("Медведь покушал");
    }

    @Override
    public void walk() {
        System.out.println("Медведь погулял");
    }

    public void hibernate(){
        System.out.println("Медведь впал в спячку");
    }

    public void swim(int meters) throws DistanceException {
        if(meters > 25 || meters < 1){
            throw new DistanceException("Указанное расстояние является слишком малым или слишком большим");
        }
        System.out.println("Медведь проплыл " + meters + " метров");
    }
}
