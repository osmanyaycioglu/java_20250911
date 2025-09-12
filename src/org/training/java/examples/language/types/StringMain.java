package org.training.java.examples.language.types;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "osman";
        String concatLoc = str1.concat(" yaycıoğlu"); // Yapmamaya calis
        String str2 = new String("osman yay"); // Yapma
        String str3 = "deneme : " + str1 + " " + str2;

        String totalStr = "First : ";
        for (int i = 0; i < 10; i++) {
            totalStr = totalStr + " " + i;
        }

        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("First : ");
        for (int i = 0; i < 10; i++) {
            builderLoc.append(" ").append(i);
        }




    }
}
