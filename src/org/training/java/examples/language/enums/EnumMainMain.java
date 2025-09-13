package org.training.java.examples.language.enums;

public class EnumMainMain {


    public static void main(String[] args) {
        EGender genderLoc = EGender.MALE;

        if (genderLoc == EGender.MALE) {
            System.out.println("Erkek if");
        }

        switch (genderLoc) {
            case MALE:
                System.out.println("Erkek");
                break;
            case FEMALE:
                System.out.println("Kadın");
                break;
            default:
                System.out.println("Bilinmeyen");
                break;
        }

    }
}
