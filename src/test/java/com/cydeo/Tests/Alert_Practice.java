package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Alert_Practice extends TestBase {

    @Test
    public void alertTest(){
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsalert= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        jsalert.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        assertTrue(resultText.isDisplayed());


    }
}
