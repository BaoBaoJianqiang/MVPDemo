package com.example.jianqiang.testdatabindingallsyntax;

/**
 * Created by jianqiang on 17/5/4.
 */

public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}
