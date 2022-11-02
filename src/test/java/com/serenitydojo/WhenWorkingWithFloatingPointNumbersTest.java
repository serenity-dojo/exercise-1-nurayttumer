package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbersTest {
    float fahrenheit;


    @Test
    public void givenCelciusIsPositiveFloat_FahrenheitIsPositive() {
        Assert.assertEquals(50f, WhenWorkingWithFloatingPointNumbers.getFahrenheit(10f), 0.0f);
    }

    @Test
    public void givenCelciusIsNegativeFloat_FahrenheitIsNegative() {
        Assert.assertEquals(-7.5999985f, WhenWorkingWithFloatingPointNumbers.getFahrenheit(-22f), 0.0f);
    }

    @Test
    public void givenCelciusIsNegativeFloat_FahrenheitIsNegative_SameValue() {
        Assert.assertEquals(-40f, WhenWorkingWithFloatingPointNumbers.getFahrenheit(-40f), 0.0f);
    }

    @Test
    public void givenCelciusIsNegativeFloatWithDot_FahrenheitIsPositiveWithDot() {
        Assert.assertEquals(13.1f, WhenWorkingWithFloatingPointNumbers.getFahrenheit(-10.5f), 0.0f);
    }

    @Test
    public void givenCelciusIsPositiveFloatWithDot_FahrenheitIsPositiveWithDot() {
        Assert.assertEquals(50.9f, WhenWorkingWithFloatingPointNumbers.getFahrenheit(10.5f), 0.0f);
    }

    @Test
    public void givenKgIsFloatWithDots() {
        Assert.assertEquals(22.48714828491211f, WhenWorkingWithFloatingPointNumbers.getPounds(10.2f), 0.0f);
    }

    @Test
    public void givenKgIsFloat() {
        Assert.assertEquals(22.046225f, WhenWorkingWithFloatingPointNumbers.getPounds(10f), 0.0f);
    }
}
