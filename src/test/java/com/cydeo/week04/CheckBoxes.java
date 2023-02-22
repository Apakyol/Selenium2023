package com.cydeo.week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement box1= driver.findElement(By.id("box1"));
        box1.click();
        WebElement box2=driver.findElement(By.id("box2"));
        box2.click();

        System.out.println(box1.isSelected());
        System.out.println(box2.isSelected());
    }
}
