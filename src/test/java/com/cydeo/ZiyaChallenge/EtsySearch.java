package com.cydeo.ZiyaChallenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        WebElement searchBox=driver.findElement(By.xpath("//input[@name='search_query']"));
        searchBox.sendKeys("Handmade Damascus Pocket Knife Rose Wood Handle Birthday Gift Folding Knife Groomsmen Gift Anniversary Wedding Personalized Gift for Men"+ Keys.ENTER);
    }
}
