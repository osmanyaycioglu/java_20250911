package org.training.java.examples.language.oo.example1;

import org.training.java.examples.language.oo.example.Animal;

public class Elephant implements IAnimal {
    @Override
    public String talk() {
        return "Fııırrt";
    }

    @Override
    public String walk() {
        return "Elephant walk";
    }
}
