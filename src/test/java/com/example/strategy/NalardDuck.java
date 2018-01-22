package com.example.strategy;

import com.example.strategy.impl.FlyWithWin;

/**
 * Created by linke on 2018/1/20.
 */
public class NalardDuck extends  Duck{
    public NalardDuck() {
        super();
        super.setFlyingStaregy(new FlyWithWin());
    }

    @Override
    void display() {
        System.out.println("我是另一只鸭子");
    }
}
