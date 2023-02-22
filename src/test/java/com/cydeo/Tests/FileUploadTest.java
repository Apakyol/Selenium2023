package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void testFileUpload() throws InterruptedException {
        driver.get("https://practice.cydeo.com/upload");

        String filePath="C:\\Users\\90507\\Desktop";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);


    }
}
