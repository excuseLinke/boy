package com.example.EffiectiveJava;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by linke on 2017/4/10.
 */
public class TheadTest extends Thread {
    private  static final AtomicLong nextSerialNum = new AtomicLong();
     static int i =100;
        @Override
        public  void run() {
            while (i>0){
                System.out.println(nextSerialNum.getAndIncrement()+""+Thread.currentThread().getName());
                    i--;
                }
        }

}
