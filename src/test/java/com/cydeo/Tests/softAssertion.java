package com.cydeo.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
    @Test
    public void hardAssertion() {
        Assert.assertEquals("Apple","App");
        System.out.println("After Assertion failed");
        Assert.assertTrue("orange".equals("Apple"));
        System.out.println("After Assertion failed");
    }
    @Test
    public void softAssertion() {

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals("Apple","App");
        System.out.println("After Assertion failed");
        softAssert.assertTrue("orange".equals("Apple"));
        System.out.println("After Assertion failed");

        softAssert.assertAll();
    }
}
