package com.serenitydojo;

public class WhenWorkingWithFloatingPointNumbers {

    private WhenWorkingWithFloatingPointNumbers() {
    }

    static float fahrenheit;
    float kg;
    float pounds;

    public static float getFahrenheit(float celcius) {
        fahrenheit = (float) (celcius * 1.8) + 32;
        return fahrenheit;
    }

    public static float getPounds(float kg) {
        kg *= 2.2046226218529f;
        return kg;
    }
}
