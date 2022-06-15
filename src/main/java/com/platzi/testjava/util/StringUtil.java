package com.platzi.testjava.util;

public class StringUtil {

    public static String repeat(String str, int times){
        String result = "";

        if(times < 0){
            throw new IllegalArgumentException("Negative times is not allowed");
        }
        return result.concat(result += str).repeat(times);
    }
}
