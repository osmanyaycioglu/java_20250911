package org.training.java.examples.language.oo.example2;

public class Elephant implements IAnimal {
    @Override
    public String talk() {
        return "Fııırrt";
    }

    @Override
    public String walk() {
        return "Elephant walk";
    }

    @Override
    public IAnimalAction getAnimalAction() {
        return null;
    }
}
