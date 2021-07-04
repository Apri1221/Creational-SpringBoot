package com.example.creational.singleton;

/**
 * Singleton
 * @Bean membuat singleton otomatis. (Spring scr default dibangun Singleton)
 */
public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    // public void increment()
    public synchronized void increment() {
        value++;
    }

}
