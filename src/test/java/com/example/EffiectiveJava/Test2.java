package com.example.EffiectiveJava;

/**
 * Created by linke on 2017/5/18.
 */
public class Test2 implements Test {
    private final Test rr;

    public Test2(Test rr) {
        this.rr = rr;
    }

    @Override
    public String add() {
        return null;
    }
}
