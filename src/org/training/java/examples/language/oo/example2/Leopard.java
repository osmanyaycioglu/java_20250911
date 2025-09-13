package org.training.java.examples.language.oo.example2;

import org.training.java.examples.language.oo.example2.actions.Bite;

public class Leopard implements IAnimal {

    @Override
    public String walk() {
        return "4 leg walk leopard";
    }

    @Override
    public String talk() {
        return "groooow";
    }

    @Override
    public IAnimalAction getAnimalAction() {
        return new Bite("Lion bite");
    }
}
