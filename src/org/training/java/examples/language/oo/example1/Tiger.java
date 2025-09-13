package org.training.java.examples.language.oo.example1;

import org.training.java.examples.language.oo.example.Animal;

public class Tiger implements ICatFamily {

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
