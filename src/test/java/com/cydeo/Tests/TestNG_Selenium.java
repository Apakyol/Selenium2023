package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium extends TestBase {


    @Test
    public void googleTitle() {
        driver.get("http://www.google.com");
        String expectedTitle = driver.getTitle();
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle,"Google title is not matching!");
    }
    /*public void testIphone13() {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
//go to "https://www.amazon.com.tr/"
        driver.get("https://www.amazon.com.tr/");
        //driver.manage().window().maximize();
//accept cookies
        WebElement AlertButton = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        AlertButton.click();
//search iphone13 512
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.click();
        searchBox.sendKeys("iphone13 512" + Keys.ENTER);
//check that result are listed
        WebElement resultListed = driver.findElement(By.xpath("//span[text()=' için sonuçlar gösteriliyor']"));
        Assert.assertTrue(resultListed.isDisplayed());
//click iphone13 at the top of the list
        WebElement iphone13 = driver.findElement(By.partialLinkText("Apple iPhone 13"));
        iphone13.click();
//log the following values for each size .size information .price . color .stock status
        WebElement name = driver.findElement(By.id("productTitle"));
        WebElement sizeInformation = driver.findElement(By.xpath("(//span[@class='selection'])[1]"));
        WebElement color = driver.findElement(By.xpath("(//span[@class='selection'])[2]"));
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        WebElement priceAfterComa = driver.findElement(By.xpath("(//span[@class='a-price-fraction'])[6]"));
        WebElement stockStatus = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
        WebElement priceTl = driver.findElement(By.xpath("(//span[@class='a-price-symbol'])[6]"));
        System.out.print(name.getText().substring(6, 15));
        System.out.println("  Size:" + sizeInformation.getText());
        System.out.print("Color:" + color.getText() + "  ");
        System.out.print("Price:" + price.getText() + ",");
        System.out.print(priceAfterComa.getText());
        System.out.print(priceTl.getText());
        System.out.println();
        System.out.println("Stock:" + stockStatus.getText());

     */
    }
