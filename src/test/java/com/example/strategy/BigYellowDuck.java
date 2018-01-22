package com.example.strategy;

import com.example.strategy.impl.NoFlyWin;

/**
 * Created by linke on 2018/1/20.
 */
public class BigYellowDuck extends Duck {
    public BigYellowDuck() {
        super.setFlyingStaregy(new NoFlyWin());
    }

    @Override
    void display() {
        System.out.println("我是大黄鸭");
    }
}
