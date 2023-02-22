package com.cydeo.AppleTest01022023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testIphone14 {

    @Test
    public void testIphone14() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//go to "https://www.amazon.com.tr/"
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();
//accept cookies
        //WebElement AlertButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        //AlertButton.click();
        WebElement Alert=driver.findElement(By.id("sp-cc-accept"));
        Alert.click();
        //Keys
//search iphone14
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.click();
        searchBox.sendKeys("iphone14" + Keys.ENTER);
//check that result are listed
       WebElement resultListed = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
       Assert.assertTrue(resultListed.isDisplayed());

        //click iphone14 at the top of the list
        WebElement iphone14 = driver.findElement(By.linkText("Apple iPhone 14 (512 GB) - Gece yarısı"));
        iphone14.click();
//log the following values for each size .size information .price . color .stock status
        //WebElement Iphone14promax512 = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
       // Iphone14promax512.click();

        WebElement sizeInformation = driver.findElement(By.xpath("(//span[@class='selection'])[1]"));
        WebElement selectcolor = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/116GEYTP2ZL._SS36_.jpg']"));
        selectcolor.click();
        WebElement color = driver.findElement(By.xpath("(//span[@class='selection'])[2]"));
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        WebElement priceAfterComa = driver.findElement(By.xpath("(//span[@class='a-price-fraction'])[6]"));

        WebElement stockStatus = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
        WebElement priceTl = driver.findElement(By.xpath("(//span[@class='a-price-symbol'])[6]"));
        //System.out.print(iphone14.getText().substring(6, 15));
        //System.out.println("  Size:" + sizeInformation.getText());
        System.out.print("Color:" + color.getText() + "  ");
        System.out.print("Price:" + price.getText() + ",");
        System.out.print(priceAfterComa.getText());
        System.out.print(priceTl.getText());
        System.out.println();
        System.out.println("Stock:" + stockStatus.getText());

    }
}
