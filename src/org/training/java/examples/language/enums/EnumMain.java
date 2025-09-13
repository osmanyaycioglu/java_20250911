package org.training.java.examples.language.enums;

public class EnumMain {

    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;


    public static void main(String[] args) {
        int intVal = 100;
        switch (intVal) {
            case GENDER_MALE:
                System.out.println("Erkek");
                break;
            case GENDER_FEMALE:
                System.out.println("Kadın");
                break;
            default:
                System.out.println("Bilinmeyen");
                break;
        }

    }
}
