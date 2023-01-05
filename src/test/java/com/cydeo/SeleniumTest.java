package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL="https://practice.cydeo.com";
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
        if (actualURL.equals(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else {
            System.out.println("URL verification FAILED!");
        }

     // 4. verify title:
        //Expected : Practice
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }
        driver.close();
    }
}
