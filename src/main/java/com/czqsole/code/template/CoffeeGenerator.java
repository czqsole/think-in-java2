package com.czqsole.code.template;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by czqsole on 2018/5/29.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private static Random random = new Random(47);
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }
    @Override
    public Coffee next() {
        return null;
    }

    class Itr implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            // do nothing
        }

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Itr();
    }

}
