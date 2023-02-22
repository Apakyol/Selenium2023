package com.cydeo.week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement gmail = driver.findElement(By.xpath("//a[.='Home']"));

        System.out.println(gmail.getText());

        driver.navigate().refresh();

        WebElement home = driver.findElement(By.xpath("//a[.='Home']"));

        System.out.println(home.getText());
    }
}