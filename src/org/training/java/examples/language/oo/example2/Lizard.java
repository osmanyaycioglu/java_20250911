package org.training.java.examples.language.oo.example2;

import org.training.java.examples.language.oo.example2.actions.Bite;
import org.training.java.examples.language.oo.example2.actions.Sun;

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

    @Override
    public IAnimalAction getAnimalAction() {
        return new Sun("Lizard sun");
    }
}
