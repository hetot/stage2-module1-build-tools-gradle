package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty())
            return false;
        for (String num : args) {
            try {
                if (!StringUtils.isPositiveNumber(num))
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}