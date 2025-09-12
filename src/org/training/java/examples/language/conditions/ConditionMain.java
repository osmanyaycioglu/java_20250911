package org.training.java.examples.language.conditions;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        int     a          = 0;
        do {

        } while (a != 1999);

        while (a != 1999) {
            System.out.println("Bir rakam girin : ");
            a = scannerLoc.nextInt();
            System.out.println("Girdiğiniz rakam : " + a);
            if (a > 50) {
                System.out.println("Rakam 50 den büyük");
            } else {
                System.out.println("Rakam 50 den küçük");
            }
            System.out.println("İkinci düşünce :");
            if (a > 1_000) {
                System.out.println("Rakam 1000 den büyük");
            } else if (a > 500 && a <= 1000) {
                System.out.println("Rakam 500 ile 1000 arasında");
            } else if (a > 200 && a <= 500) {
                System.out.println("Rakam 200 ile 500 arasında");
            } else if (a >= 100) {
                System.out.println("Rakam 100 ile 200 arasında");
            } else {
                System.out.println("Rakam 100 den küçük");
            }

            switch (a) {
                case 0:
                    System.out.println("a 0 ve init başlıyor...");
                    System.out.println("init");
                    break;
                case 1:
                    System.out.println("a 1 ve başlatılıyor...");
                    System.out.println("start");
                    break;
                case 2:
                case 3:
                    System.out.println("a 2 ve yeniden başlatılıyor...");
                    System.out.println("restart");
                    break;
                default:
                    System.out.println("Bu benim komutum değil");
                    break;
            }
        }
    }
}
