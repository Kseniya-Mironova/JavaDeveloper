package com.javastudy.homework8.task2.iterators;

import java.util.Iterator;

public class ReverseDirection implements Iterable<Integer> {

    private int numbers;

    public ReverseDirection(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumIterator();
    }


    class NumIterator implements Iterator<Integer> {

        private int pos;

        @Override
        public boolean hasNext() {
            return numbers != 0;
        }

        @Override
        public Integer next() {

            pos = numbers % 10;
            numbers/=10;

            return pos;
        }
    }
}
