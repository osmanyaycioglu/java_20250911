package org.training.java.examples.language.oo.example1;

import org.training.java.examples.language.oo.example.Animal;

public class Lizard implements IAnimal {

    public String sun(){
        return "Lizard sun";
    }

    @Override
    public String walk() {
        return "half 4 leg lizard";
    }

    @Override
    public String talk() {
        return "tısss";
    }
}
