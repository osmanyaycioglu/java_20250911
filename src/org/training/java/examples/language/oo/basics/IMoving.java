package org.training.java.examples.language.oo.basics;

public interface IMoving {

    int MOVE_COUNT = 100;

    void forward(int metres);

    void backward(int metres);

    default String test() {
        System.out.println("sdhsdhf");
        forward(100);
        backward(200);
        return "Test success";
    }

    public static void staticMethod(){
        System.out.println("Static method");
    }

}
