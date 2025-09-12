package org.training.java.examples.language.collections;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<String> stringsLoc = new ArrayList<>();

        for (int i = 0; i < 1_000; i++) {
            stringsLoc.add("index : " + i);
        }

        for (String stringLoc : stringsLoc) {
            System.out.println(stringLoc);
        }

        for (int i = 0; i < stringsLoc.size(); i++) {
            System.out.println("Eleman " + i + " : " + stringsLoc.get(i));
        }
    }
}
