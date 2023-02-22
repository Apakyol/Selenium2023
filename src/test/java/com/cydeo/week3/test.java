package com.cydeo.week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");

        //WebElement searchBar=driver.findElement(By.id("global-enhancements-search-query"));
       // searchBar.sendKeys("Wooden Spoon");
        //WebElement button=driver.findElement(By.xpath("//button[@type"))

        WebElement Dropdownlink=driver.findElement(By.id("dropdownMenuLink"));
        Dropdownlink.click();

        WebElement linkName=driver.findElement(By.linkText("Etsy"));
        linkName.click();
    }
}
