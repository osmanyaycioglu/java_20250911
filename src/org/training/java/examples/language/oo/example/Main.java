package org.training.java.examples.language.oo.example;

public class Main {
    public static void main(String[] args) {
        Animal animalLoc = new Tiger();

        System.out.println("animal talk result : " + animalLoc.talk());
        System.out.println("animal walk result : " + animalLoc.walk());
        if (animalLoc instanceof Tiger) {
            Tiger tigerLoc = (Tiger) animalLoc;
            System.out.println("animal bite result : " + tigerLoc.bite());
        } else if (animalLoc instanceof Lizard) {
            Lizard lizardLoc = (Lizard) animalLoc;
            System.out.println("animal sun result : " + lizardLoc.sun());
        }
    }
}
