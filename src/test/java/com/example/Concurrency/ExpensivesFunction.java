package com.example.Concurrency;

import java.math.BigInteger;

/**
 * Created by linke on 2017/5/17.
 */
public class ExpensivesFunction implements Computable<String,BigInteger>{
    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        return  new BigInteger(arg);
    }
}
