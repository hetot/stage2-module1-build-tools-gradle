package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (str.charAt(0) == '0' && str.length() > 1)
                return false;
            return Double.parseDouble(str) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
