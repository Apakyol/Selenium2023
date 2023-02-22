package com.cydeo.Tests.day12;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void test1(){
        Driver.getDriver().get("https://library1.cydeo.com");
    }
}
