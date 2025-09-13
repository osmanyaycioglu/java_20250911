package org.training.java.examples.language.oo.basics;

public abstract class Car implements IMoving {

    private int currentSpeed;
    private final int maxSpeed;
    private final int avgSpeed;

    public Car(final int maxSpeedParam,
               final int avgSpeedParam) {
        maxSpeed = maxSpeedParam;
        avgSpeed = avgSpeedParam;
    }

    public void forward(int metres) {
        System.out.println("Moving forward : " + (metres / avgSpeed));
    }

    public void backward(int metres) {
        System.out.println("Moving backward : " + (metres / avgSpeed));
    }

    public void anotherMethod() {
        System.out.println("Another method");
    }

}
