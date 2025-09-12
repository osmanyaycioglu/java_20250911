package org.training.java.examples.language.oo.basics;

public class Ford extends Car {

    public Ford() {
        super(200,
              100);
    }


    @Override
    public void forward(final int metres) {
        System.out.println("Ford Forward");
        super.forward(metres);
    }

}
