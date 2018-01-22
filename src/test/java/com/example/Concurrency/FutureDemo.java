package com.example.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by linke on 2017/12/25.
 */
public class FutureDemo {
    public static void main(String[] args) {
         AtomicLong num = new AtomicLong(100);
        LinkedBlockingDeque blockingDeque = new LinkedBlockingDeque();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i=0;i<3;i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    while (num.get()>0) {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println(num.decrementAndGet());
                    }
                }
            });
        }
        executor.shutdown();
    }
}


