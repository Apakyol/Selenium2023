package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");

        WaitUtility.waitSeconds(3);
       RadioSelectUtility.clickAndVerifyRadioButton(driver,"sport","hockey");

        RadioSelectUtility.clickAndVerifyRadioButton(driver,"color","red");



    }
}
