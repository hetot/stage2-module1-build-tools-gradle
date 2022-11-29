package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String num : args) {
            if (Integer.parseInt(num) < 0)
                return false;
        }
        return true;
    }
}