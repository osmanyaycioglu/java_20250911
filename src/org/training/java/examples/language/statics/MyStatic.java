package org.training.java.examples.language.statics;

public class MyStatic {

    public static String defaultStr = "Hello";

    public static String createStr(int count){
        StringBuilder builderLoc = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builderLoc.append(defaultStr).append(" ");
        }
        return builderLoc.toString();
    }

}
