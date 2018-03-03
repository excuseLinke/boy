package com.example;

import java.time.Instant;

/**
 * Created by linke on 2018/3/3.
 */
public class AlibabaNorm {
    private static Object time;

    public static void main(String[] args) {
    }
    //比较
    private static int get(int a, int b) {
        return a > b ? 1:(a == b ? 0 : -1);
    }

    /**
     * {@link java.time.Instant}
     * thread-safe的工具类，和 Date类似
     * {@link java.util.Date}
     */
    public static void getTime() {
        Instant.now().getEpochSecond();
    }
}
