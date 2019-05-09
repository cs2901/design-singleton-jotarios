package com.utec.design.patterns;

public class SimpleThread extends Thread {
    long id;

    SimpleThread(long id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("thread " + this.id + " está intentando crear una instancia");
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    }
}
