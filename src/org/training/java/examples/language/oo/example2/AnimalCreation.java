package org.training.java.examples.language.oo.example2;

public class AnimalCreation {

    public static IAnimal createAnimal(int index){
        switch (index) {
            case 1:
                return new Tiger();
            case 2:
                return  new Lion();
            case 3:
                return  new Lizard();
            case 4:
                return  new Elephant();
            case 5:
                return  new Leopard();
            case 6:
                return  new Eagle();

            default:
                return null;

        }
    }

    public static void showMenu(){
        System.out.println("1-Tiger");
        System.out.println("2-Lion");
        System.out.println("3-Lizard");
        System.out.println("4-Elephant");
        System.out.println("5-Leopard");
        System.out.println("6-Leopard");
    }
}
