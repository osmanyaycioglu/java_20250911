package org.training.java.examples.language.arrays;

public class Arrays2Main {
    public static void main(String[] args) {
        String[] strs = new String[10];
        strs[4] = "osman";
        strs[7] = "yaycıoğlu";
        for (String strLoc : strs) {
            System.out.println(strLoc);
        }

        String[] strsNew = new String[20];
        System.arraycopy(strs, 0, strsNew, 0, 10);

        strsNew[10] = "deneme";


    }
}
