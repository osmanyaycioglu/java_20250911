package org.training.java.examples;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static final int GAME_ITER_COUNT          = 10;
    public static final int GAME_SCORE_ARCHIVE_COUNT = 10;

    private Random random     = new Random();
    private int[]  scores     = new int[GAME_SCORE_ARCHIVE_COUNT];
    private int    scoreIndex = 0;

    public void showScores() {
        System.out.println("son " + GAME_SCORE_ARCHIVE_COUNT + " skor :");
        for (int i = 0; i < GAME_SCORE_ARCHIVE_COUNT; i++) {
            int index = (scoreIndex + i) % GAME_SCORE_ARCHIVE_COUNT;
            System.out.println((i + 1) + "." + scores[index]);
        }
    }

    public void printMenu() {
        System.out.println("Oyun menüsü:");
        System.out.println("1-Oyuna başla");
        System.out.println("2-Oyun skorları");
        System.out.println("3-Çıkış");
        System.out.println("Seçiminiz : ");
    }

    public void startGame(final Scanner scannerLoc) {
        int randomInt = this.random.nextInt(100);
        System.out.println("Bir sayı tuttum. " + randomInt);
        for (int i = 0; i < GAME_ITER_COUNT; i++) {
            System.out.println("Tahminin nedir : ");
            int guessNumber = scannerLoc.nextInt();
            if (guessNumber == randomInt) {
                int score = GAME_ITER_COUNT - i;
                System.out.println("Bildiniz ve skorunuz : " + score);
                scores[scoreIndex % GAME_SCORE_ARCHIVE_COUNT] = score;
                scoreIndex++;
                break;
            } else if (guessNumber > randomInt) {
                System.out.println("Tahmininiz büyük");
            } else {
                System.out.println("Tahmininiz küçük");
            }
        }
    }
}
