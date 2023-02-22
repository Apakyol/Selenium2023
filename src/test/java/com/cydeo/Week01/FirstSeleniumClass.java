package com.cydeo.Week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //1. step
        WebDriverManager.edgedriver().setup();

        WebDriver driverChrome = new ChromeDriver(); // 2 .step

        driverChrome.get("https://practice.cydeo.com/");

        WebDriver driverEdge = new EdgeDriver();

        driverEdge.get("https://www.google.com");
    }
}