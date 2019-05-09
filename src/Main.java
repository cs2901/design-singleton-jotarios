package com.utec.design.patterns;

public class Main {

    public static void main(String[] args) {
        SimpleThread thr = new SimpleThread(1);
        thr.start();
        SimpleThread thr1 = new SimpleThread(2);
        thr1.start();
        SimpleThread thr2 = new SimpleThread(3);
        thr2.start();

        try {
            thr.join();
            thr1.join();
            thr2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
