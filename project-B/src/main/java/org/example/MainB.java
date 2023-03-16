package org.example;

/**
 * @author simple
 */
public class MainB {
    static {
        System.out.println("load project-b Main");
    }

    public void sleep() {
        MainC2.sleep();
    }
}