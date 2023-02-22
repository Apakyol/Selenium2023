package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class JSExecuter extends TestBase {
    @Test

    public void scrollingTest() throws InterruptedException {
        driver.get("https://practice.cydeo.com/");
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);",cydeoLink);
       // cydeoLink.click();
        sleep(3000);
        cydeoLink.click();

    }
}
