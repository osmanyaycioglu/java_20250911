package org.training.java.examples;

public class StringUtil {

    public static boolean checkStringForNullAndEmptyAndBlank(String str){
        return str != null && !str.isEmpty() && !str.isBlank();
    }

}
