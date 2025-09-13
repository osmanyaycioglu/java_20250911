package org.training.java.examples.language.exceptions;

public class ExceptionMain2 {

    public static void main(String[] args) {
        ExceptionMain2 exceptionMainLoc = new ExceptionMain2();
        exceptionMainLoc.callMe2(null);

        try {
            exceptionMainLoc.callMe(null);
        } catch (MyException eParam) {
            System.out.println("Deneme");
        }
        try {
            String        stringLoc        = exceptionMainLoc.callMeFirst(null);
            System.out.println(stringLoc);
        } catch (NullPointerException exp) {
            System.out.println("I got Null exception : " + exp.getClass());
            exp.printStackTrace();
        } catch (Exception exp) {
            System.out.println("I got exception : " + exp.getClass());
            exp.printStackTrace();
        } finally {
            System.out.println("Try finally block");
        }
        System.out.println("Main method ends....");
    }

    public String callMeFirst(String str) throws MyException {
        System.out.println("callMeFirst Called");
        try {
            String stringLoc = callMe(str);
            System.out.println("CallMe Result : " + stringLoc);
            return stringLoc;
        } catch (NullPointerException exp) {
            System.out.println("CallMeFirst Nullpointer Exception");
            throw exp;
        } catch (MyException exp) {
            System.out.println("CallMeFirst Nullpointer Exception");
            throw exp;
        }
    }

    public String callMe(String str) throws MyException {
        System.out.println("Method First Line");
        if (str == null){
            throw new MyException();
        }
        String concatLoc = str.concat(" deneme");
        System.out.println("Before return");
        return concatLoc;

    }

    public String callMe2(String str) {
        System.out.println("Method First Line");
        if (str == null){
            throw new MyRuntimeException();
        }
        String concatLoc = str.concat(" deneme");
        System.out.println("Before return");
        return concatLoc;

    }

}
