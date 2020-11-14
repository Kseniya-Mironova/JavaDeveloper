package com.javastudy.homework5.zoo;

import com.javastudy.homework5.zoo.animal.*;
import com.javastudy.homework5.zoo.exceptions.*;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Гоша");
        Cat cat = new Cat("Маша");
        Dog dog = new Dog("Рекс");
        Lion lion = new Lion("Симбо");
        Zebra zebra = new Zebra("Алиса");

        try {
            bear.say();
            bear.eat();
            bear.swim(15);

            cat.walk();
            cat.sharpenClaws();

            lion.relax();

            dog.play("мяч");
            dog.play("мяч", "пуллер");
        }
        catch (DistanceException ex){
            System.out.println(ex.getName());
        }
        catch (ToyException ex){
            System.out.println(ex.getName());
        }
    }
}
