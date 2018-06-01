package com.czqsole.code.template;

import java.util.List;

/**
 * Created by czqsole on 2018/5/30.
 */
public class GenericMethods {

    /**
     * 泛型方法：修饰符
     * 1. 使用的时候不需要指明参数类型
     * @param x
     * @param <T>
     */
    public <T> void f(T x) {
        System.out.printf("%s\n", x.getClass().getName());
    }

    public <T, V, A> void f2(T t, V v, List<A> a) {

    }

    public static void main(String[] args) {
        GenericMethods g = new GenericMethods();
        g.f(1);
        g.f("123");
        g.f(2.4);
        g.f(g);

    }
}
