package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenWorkingWithStringsTest {

    @Test
    public void lower() {
        Assert.assertEquals("input", WhenWorkingWithStrings.lower("INPUT"));
    }

    @Test
    public void upper() {
        Assert.assertEquals("INPUT", WhenWorkingWithStrings.upper("input"));
    }

    @Test
    public void trim() {
        Assert.assertEquals("INP UT", WhenWorkingWithStrings.trim("    INP UT "));
        Assert.assertEquals("6", String.valueOf(WhenWorkingWithStrings.trim("    INP UT ").length()));
    }

    @Test
    public void lenght() {
        Assert.assertEquals("5", WhenWorkingWithStrings.lenght("INPUT"));
    }

    @Test
    public void replace() {
        Assert.assertEquals("output", WhenWorkingWithStrings.replace("asd", "output"));
    }

}