package org.training.java.examples.language.oo.example2;


import org.training.java.examples.language.exceptions.MyException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            AnimalCreation.showMenu();
            System.out.println("Choose:");
            int iLoc = scannerLoc.nextInt();

            IAnimal animalLoc = AnimalCreation.createAnimal(iLoc);

            System.out.println("animal talk result : " + animalLoc.talk());
            System.out.println("animal walk result : " + animalLoc.walk());
            IAnimalAction animalActionLoc = animalLoc.getAnimalAction();
            if (animalActionLoc != null) {
                System.out.println("animal action : " + animalLoc.getAnimalAction()
                                                                 .doAction());
            }
        } catch (IllegalStateException | NullPointerException exp) {
            exp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();
        }

    }

    public static void main2(String[] args) {

        Scanner scannerLoc = null;
        try {
            scannerLoc = new Scanner(System.in);
            AnimalCreation.showMenu();
            System.out.println("Choose:");
            int iLoc = scannerLoc.nextInt();

            IAnimal animalLoc = AnimalCreation.createAnimal(iLoc);

            System.out.println("animal talk result : " + animalLoc.talk());
            System.out.println("animal walk result : " + animalLoc.walk());
            IAnimalAction animalActionLoc = animalLoc.getAnimalAction();
            if (animalActionLoc != null) {
                System.out.println("animal action : " + animalLoc.getAnimalAction()
                                                                 .doAction());
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            if (scannerLoc != null) {
                scannerLoc.close();
            }
        }

    }

}
