package com.javastudy.homework8.task2.iterators;

import java.util.Iterator;

public class ForwardDirection implements Iterable<Integer> {

    private int numbers;

    public ForwardDirection(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumIterator();
    }


    class NumIterator implements Iterator<Integer> {

        private int pos;
        private int count = 999;

        @Override
        public boolean hasNext() {
            return count != 0;
        }

        @Override
        public Integer next() {

         if (count == 999)   {
             int temp = numbers;
             count = 0;
             while(temp != 0){
                 count++;
                 temp/=10;
             }
         }

         pos = numbers / (int)Math.pow(10, count - 1);
         pos %= 10;
         count--;

         return pos;
        }
    }
}
