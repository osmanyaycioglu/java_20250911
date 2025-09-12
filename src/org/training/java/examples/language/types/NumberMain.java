package org.training.java.examples.language.types;

import java.math.BigDecimal;

public class NumberMain {
    public static void main(String[] args) {
        long b = 100L;
        Long bo = 100L;

        int a = 100;
        Integer ao = 100;

        short c = 10;
        Short co = 10;

        byte d = 10;
        Byte do1 = 10;

        float e  = 10.5F;
        Float eo  = 10.5F;

        double f = 10.5;
        Double fo = 10.5;
        if (f == fo) {
            System.out.println("Doublelar eşit");
        }

        BigDecimal bigDecimalLoc = new BigDecimal(100);

    }
}
