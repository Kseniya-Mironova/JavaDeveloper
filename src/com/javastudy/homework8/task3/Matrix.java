package com.javastudy.homework8.task3;

import java.util.Iterator;

public class Matrix implements Iterable<Integer> {

    Integer[][] matrix;

    public Matrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ScrollIterator(matrix);
    }

    class ScrollIterator implements Iterator<Integer> {

        int[] line;
        int index;

        public ScrollIterator(Integer[][] matrix) {

            line = new int[(int)Math.pow(matrix.length, 2)];

            int startX = 0;
            int endX = matrix.length;

            int startY = 0;
            int endY = matrix.length - 1;

            int index = 0;

            while (index < (int)Math.pow(matrix.length, 2)) {

                for (int i = startX; i < startX + endX; i++) {
                    line[index] = matrix[startY][i];
                    index++;
                }

                startY++;
                endX--;

                startX = startX + endX;

                for (int i = startY; i < startY + endY; i++) {
                    line[index] = matrix[i][startX];
                    index++;
                }

                startX--;
                endY--;

                startY = startY + endY;

                for (int i = startX; i > startX - endX; i--) {
                    line[index] = matrix[startY][i];
                    index++;
                }

                startX = startX - endX + 1;
                startY--;

                for (int i = startY; i > startY - endY; i--) {
                    line[index] = matrix[i][startX];
                    index++;
                }

                startX++;
                startY = startY - endY + 1;
                endY--;
                endX--;
            }
        }

        @Override
        public boolean hasNext() {
            return index < (int)Math.pow(matrix.length, 2);
        }

        @Override
        public Integer next() {
            return line[index++];
        }
    }
}