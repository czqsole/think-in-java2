package com.czqsole.code.template;

/**
 * Author: czqsole
 * Date: 2018/6/1
 */
public class CountedObject {
    private static long counter = 0L;
    private final long id = counter++;
    public long id() { return id; }

    public String toString() {
        return "CountedObject " + id();
    }
}
