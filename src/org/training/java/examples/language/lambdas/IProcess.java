package org.training.java.examples.language.lambdas;

@FunctionalInterface
public interface IProcess {
    String execute(String str);

    default void method() {
        System.out.println("test");
    }

}
