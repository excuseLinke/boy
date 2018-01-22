package com.example.strategy;

/**
 * Created by linke on 2018/1/20.
 */
public class TestDuck {
    public static void main(String[] args) {
        Duck duck =null;
        duck =new BigYellowDuck();
        duck.display();
        duck.quack();
        duck.fly();
    }
}
