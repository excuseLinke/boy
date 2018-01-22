package com.example.strategy;

import com.example.strategy.impl.FlyWithWin;

/**
 * Created by linke on 2018/1/20.
 */
public class ReadheadDuck extends  Duck {
    public ReadheadDuck() {
        super();
        super.setFlyingStaregy(new FlyWithWin());
    }

    @Override
    void display() {
        System.out.println("我是小黄鸭");
    }
}
