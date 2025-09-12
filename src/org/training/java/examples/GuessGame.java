package org.training.java.examples;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        int[]   scores     = new int[10];
        int scoreIndex = 0;
        Random  randomLoc  = new Random();

        while (true) {
            System.out.println("Oyun menüsü:");
            System.out.println("1-Oyuna başla");
            System.out.println("2-Oyun skorları");
            System.out.println("3-Çıkış");
            System.out.println("Seçiminiz : ");
            int menuIndex = scannerLoc.nextInt();
            switch (menuIndex) {
                case 1: {
                    int randomInt = randomLoc.nextInt(100);
                    System.out.println("Bir sayı tuttum. " + randomInt);
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Tahminin nedir : ");
                        int guessNumber = scannerLoc.nextInt();
                        if (guessNumber == randomInt) {
                            int score = 10 - i;
                            System.out.println("Bildiniz ve skorunuz : " + score);
                            scores[scoreIndex % 10] = score;
                            scoreIndex++;
                            break;
                        } else if (guessNumber > randomInt) {
                            System.out.println("Tahmininiz büyük");
                        } else {
                            System.out.println("Tahmininiz küçük");
                        }
                    }
                }
                break;
                case 2: {
                    System.out.println("son 10 skor :");
                    for (int i = 0; i < 10; i++) {
                        int index = (scoreIndex + i) % 10;
                        System.out.println((i + 1) + "." + scores[index]);
                    }
                    break;
                }
                case 3:
                default:
                    return;
            }

        }
    }
}
