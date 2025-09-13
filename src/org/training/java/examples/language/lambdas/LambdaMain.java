package org.training.java.examples.language.lambdas;

import java.util.List;

public final class LambdaMain {

    public static void main(String[] args) {

        final int localVar = 100;

        final IProcess processLoc = new ProcessImpl();
        System.out.println(processLoc.execute("osman"));

        IProcess processLoc1 = s -> {
            return "Executing : " + s;
        };
        System.out.println(processLoc1.execute("osman lambda"));

        IProcess processLoc2 = s -> "Executing : " + s + " : " + localVar;

        System.out.println(processLoc2.execute("osman short lambda"));

        List<String> stringsLoc = List.of("osman",
                                          "ali",
                                          "veli",
                                          "ayşe",
                                          "fatma",
                                          "mehmet");

        for (String stringLoc : stringsLoc) {
            System.out.println("Data : " + stringLoc);
        }

        stringsLoc.forEach(d -> System.out.println("Data : " + d));

        IExecute executeLoc =  (abc,xyz) -> {
            System.out.println("Executing : " + abc);
            for (int i = 0; i < xyz; i++) {
                System.out.println("Executing : " + i);
            }
            return "OK";
        };

        String process1Loc = executeLoc.execute("process1",
                                                10);

        IExecute executeLoc2 = LambdaMain::methodRTY;

        LambdaMain lambdaMainLoc = new LambdaMain();

        IExecute executeLoc3 = lambdaMainLoc::helpFGH;
    }

    public static String methodRTY(String s,int r){
        System.out.println("Executing : " + s);
        for (int i = 0; i < r; i++) {
            System.out.println("Executing : " + i);
        }
        return "OK";
    };

    public String helpFGH(String s,int r){
        System.out.println("Executing : " + s);
        for (int i = 0; i < r; i++) {
            System.out.println("Executing : " + i);
        }
        return "OK";
    };

}
