package com.czqsole.code.template;

/**
 * Author: czqsole
 * Date: 2018/6/1
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
