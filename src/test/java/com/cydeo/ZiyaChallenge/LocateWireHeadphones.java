package com.cydeo.ZiyaChallenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWireHeadphones {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");


       // WebElement popUp= driver.findElement( By.xpath("/html/body/div[2]/div/div/button"));
       // popUp.click();


        
        Thread.sleep(3000);
        WebElement menu= driver.findElement(By.xpath("//a[.='Wired Headphones']"));
    }
}
