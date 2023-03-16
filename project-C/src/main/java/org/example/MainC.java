package org.example;

/**
 * @author simple
 */
public class MainC {
    static {
        System.out.println("load project-c Main");
    }

    public static void sleep2() {
        try {
            Thread.sleep(1000000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}