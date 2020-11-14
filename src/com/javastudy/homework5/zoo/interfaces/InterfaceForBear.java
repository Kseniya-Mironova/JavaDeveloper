package com.javastudy.homework5.zoo.interfaces;

import com.javastudy.homework5.zoo.exceptions.*;

public interface InterfaceForBear {

    void hibernate();

    void swim(int meters) throws ToyException, DistanceException;
}
