package com.example.strategy;

/**
 * Created by linke on 2018/1/20.
 */
public abstract   class Duck {
    private  FlyingStaregy flyingStaregy;

    public void setFlyingStaregy(FlyingStaregy flyingStaregy) {
        this.flyingStaregy = flyingStaregy;
    }

    abstract void display();
    void quack(){
        System.out.println("嘎嘎嘎");
    }
    void fly(){
        flyingStaregy.flys();
    }
}
