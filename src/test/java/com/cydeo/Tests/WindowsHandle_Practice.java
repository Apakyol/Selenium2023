package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandle_Practice extends TestBase {

    @Test
    public void windowsTest(){
        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("Current handle: " + currentHandle);

        Set<String> allHandles=driver.getWindowHandles();
        System.out.println("allHandles: " + allHandles);

        WebElement clickBtn=driver.findElement(By.linkText("Click Here"));
        System.out.println("clickBtn: " + clickBtn);
        clickBtn.click();

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());

        allHandles=driver.getWindowHandles();

        for (String eachHandle : allHandles) {
            System.out.println("eachHandle: " + eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


    }
}
