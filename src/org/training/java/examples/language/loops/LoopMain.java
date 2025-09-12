package org.training.java.examples.language.loops;

public class LoopMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("For Loop : " + i);
        }


        int j = 0;
        while (j < 10) {
            System.out.println("While Loop : " + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("Do While Loop : " + k);
            k++;
        } while (k < 10);
    }
}
