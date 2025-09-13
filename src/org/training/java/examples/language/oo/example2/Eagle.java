package org.training.java.examples.language.oo.example2;

public class Eagle implements IAnimal {
    @Override
    public String talk() {
        return "Gaak";
    }

    @Override
    public String walk() {
        return "Eagle walk";
    }

    @Override
    public IAnimalAction getAnimalAction() {
        return null;
    }
}
