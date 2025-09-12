package org.training.java.examples.language.statics;

public class StaticMain {
    public static void main(String[] args) {
        String resultStr = MyStatic.createStr(5);
        System.out.println(resultStr);

        System.out.println("my static call : " + MyStatic.createStr(7));
    }
}
