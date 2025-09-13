package org.training.java.examples.language.oo.example1;

public class Lion implements ICatFamily {

    public String bite() {
        return "Lion bite" ;
    }

    @Override
    public String walk() {
        return "4 leg walk lion";
    }

    @Override
    public String talk() {
        return "groooow";
    }
}
