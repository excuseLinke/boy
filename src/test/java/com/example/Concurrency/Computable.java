package com.example.Concurrency;

/**
 * Created by linke on 2017/5/17.
 */
public interface Computable<A,V> {
    V compute(A arg) throws InterruptedException;
}
