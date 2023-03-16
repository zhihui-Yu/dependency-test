package org.example;

/**
 * @author simple
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
//        Thread t1 = new Thread(() -> new MainB().sleep());
        Thread t2 = new Thread(MainC::sleep2);
//        t1.start();
        t2.start();
//        t1.join();
        t2.join();
    }
}