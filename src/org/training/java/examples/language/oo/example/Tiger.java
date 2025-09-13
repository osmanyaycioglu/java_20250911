package org.training.java.examples.language.oo.example;

public class Tiger extends Animal {

    public String bite() {
        return "Tiger bite" ;
    }

    @Override
    public String walk() {
        return "4 leg walk tiger";
    }

    @Override
    public String talk() {
        return "groooow";
    }
}
