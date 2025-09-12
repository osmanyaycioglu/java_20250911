package org.training.java.examples;

import java.util.Scanner;

public class GuessGameMain {


    public static void main(String[] args) {
        GuessGame guessGameLoc = new GuessGame();

        Scanner scannerLoc = new Scanner(System.in);
        while (true) {
            guessGameLoc.printMenu();
            int menuIndex = scannerLoc.nextInt();
            switch (menuIndex) {
                case 1: {
                    guessGameLoc.startGame(scannerLoc);
                }
                break;
                case 2: {
                    guessGameLoc.showScores();
                    break;
                }
                case 3:
                default:
                    return;
            }

        }
    }

}
