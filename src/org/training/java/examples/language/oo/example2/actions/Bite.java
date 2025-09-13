package org.training.java.examples.language.oo.example2.actions;

import org.training.java.examples.language.oo.example2.IAnimalAction;

public class Bite implements IAnimalAction {

    private String biteStr;

    public Bite(final String biteStrParam) {
        biteStr = biteStrParam;
    }

    @Override
    public String doAction() {
        return biteStr;
    }
}
