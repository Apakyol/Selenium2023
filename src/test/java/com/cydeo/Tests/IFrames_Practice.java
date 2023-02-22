package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IFrames_Practice extends TestBase {
    @Test
    public void iframeTest(){
        driver.get("https://practice.cydeo.com/iframe");

        //WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        //driver.switchTo().frame(iframe);
        //driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea=driver.findElement(By.tagName("p"));
        Assert.assertTrue(textArea.isDisplayed());




    }



}
