package org.training.java.examples.language.arrays;

import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[2] = 100;
        for (int iLoc : intArray) {
            System.out.println("alınan : " + iLoc);
        }
        Random randomLoc = new Random();
        for (int i = 0; i < 10; i++) {
            intArray[i] = randomLoc.nextInt(100);
        }
        int index = 0;
        for (int iLoc : intArray) {
            System.out.println("Randoms" + index + " : " + iLoc);
            index++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("For Randoms" + i + " : " + intArray[i]);
        }
    }
}
