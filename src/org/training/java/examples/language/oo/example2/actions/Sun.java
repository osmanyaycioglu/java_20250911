package org.training.java.examples.language.oo.example2.actions;

import org.training.java.examples.language.oo.example2.IAnimalAction;

public class Sun implements IAnimalAction {

    private String sunStr;

    public Sun(final String biteStrParam) {
        sunStr = biteStrParam;
    }

    @Override
    public String doAction() {
        return sunStr;
    }
}
