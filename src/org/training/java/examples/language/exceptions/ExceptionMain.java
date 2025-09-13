package org.training.java.examples.language.exceptions;

public class ExceptionMain {

    public static void main(String[] args) {
        ExceptionMain exceptionMainLoc = new ExceptionMain();
        try {
            String        stringLoc        = exceptionMainLoc.callMeFirst(null);
            System.out.println(stringLoc);
        } catch (Exception exp) {
            System.out.println("I got exception : " + exp.getClass());
            exp.printStackTrace();
        } finally {
            System.out.println("Try finally block");
        }
        System.out.println("Main method ends....");
    }

    public String callMeFirst(String str) {
        System.out.println("callMeFirst Called");
        try {
            String stringLoc = callMe(str);
            System.out.println("CallMe Result : " + stringLoc);
            return stringLoc;
        } catch (Exception exp) {
            System.out.println("CallMeFirst Exception");
            throw exp;
        }
    }

    public String callMe(String str) {
        System.out.println("Method First Line");
        String concatLoc = str.concat(" deneme");
        System.out.println("Before return");
        return concatLoc;

    }

}
