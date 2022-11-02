package com.serenitydojo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class WhenWorkingWithStrings {
    private WhenWorkingWithStrings() {
    }

    private static final Logger logger = LogManager.getLogger();
    private static String output ;


    public static String lower(String input) {
        output = input.toLowerCase();
        logger.info(output);
        return output;
    }

    public static String upper(String input) {
        output = input.toUpperCase();
        logger.info(output);
        return output;
    }

    public static String trim(String input) {
        output = input.trim();
        logger.info(output);
        return output;
    }

    public static String lenght(String input) {
        output = String.valueOf(input.length());
        logger.info(output);
        return output;
    }

    public static String replace(String input, String input2) {
        output = input.replace(input, input2);
        logger.info(output);
        return output;
    }
}
