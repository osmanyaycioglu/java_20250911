package org.training.java.examples.language.oo.basics;

public class BasicsMain {
    public static void main(String[] args) {
        IMoving car = new Opel();
        testCar(car);

    }

    private static void testCar(final IMoving car) {
        car.forward(50_000);
        car.backward(1_000);
    }
}
