package org.training.java.examples;

// Camel   aaaBbbCcc
// Pascal  AaaBbbCcc
// Snake   aaa_bbb_ccc
// Kebap   aaa-bbb-ccc


import org.training.java.examples.language.statics.MyStatic;

public class MyFirstClass {
    public static long myStaticLongVal = 18358734597L;

    private String myFirstField = "default";
    private int classInt;


    public MyFirstClass() {
        System.out.println("MyFirstClass init for default");
    }

    public MyFirstClass(String name) {
        System.out.println("MyFirstClass init for " + name);
        myFirstField = name;
    }

    public MyFirstClass(int intVal) {
        System.out.println("MyFirstClass init for " + intVal);
    }

    public static void main(String[] args) {

        System.out.println("Hello world");
        MyFirstClass l1 = new MyFirstClass("osman");
        MyFirstClass l2 = new MyFirstClass(10);
        MyFirstClass l3 = new MyFirstClass();
        MyFirstClass l4 = l3;
        l2=null;
        System.out.println("Before method call");
        int returnVal = l1.myMethod(10,"ksdjhfsdjkhf");
        l2 = l1;
        l2.myMethod(11, "xxxxxx");
        System.out.println("Bitiş");
        MyStatic.createStr(6);
    }


    public int myMethod(int xyz, String str) {
        return 10;
    }

    public static long getMyStaticLongVal() {
        return myStaticLongVal;
    }

    public static void setMyStaticLongVal(final long myStaticLongValParam) {
        myStaticLongVal = myStaticLongValParam;
    }

    public String getMyFirstField() {
        return myFirstField;
    }

    public void setMyFirstField(final String myFirstFieldParam) {
        myFirstField = myFirstFieldParam;
    }
}
