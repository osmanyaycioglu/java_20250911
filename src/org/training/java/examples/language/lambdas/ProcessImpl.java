package org.training.java.examples.language.lambdas;

public class ProcessImpl implements IProcess {

    @Override
    public String execute(final String str) {
        return "Executing : " + str;
    }
}
