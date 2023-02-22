package com.cydeo.week04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewCssAndXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");
                /*
        //syntax of css

        //tagname[attributeName='Value']

        // driver.get("https://practice.cydeo.com/inputs");
        // WebElement flas=driver.findElement(By.cssSelector())
        driver.get("https://practice.cydeo.com/");
        //WebElement dropDown= driver.findElement(By.cssSelector("select#state>option:nth-of-type(10)"));
        //WebElement dropDown= driver.findElement(By.cssSelector("//h2[text()='Forgot Password']"));


        //1.Css locator
        //parents to child we can use: > or space;

        2. Xpath locator
        1) absolute xpath: start from first to last step by step: /, but not recommended.
        2) relative xpath:
        start with //, continue with //, when go to child use /



        //WebElement home=driver.findElement(By.tagName("//li[@class='list-group-item'][1]"));
      //  home.click();
         */
        /*
        why findElements() is returning empty list if no math?
        because when we call the method, it will create an empty list first,
         */
        //WebElement ABtesting=driver.findElement(By.xpath("//li[@class='list-group-item'][1]"));
       // Thread.sleep(3000);
       // ABtesting.click();
        //list<WebElements> list=driver.findElements(By.xpath(//li[@class='list-group-item'][1]));

        WebElement redButn = driver.findElement(By.id("red"));
        redButn.click();
        WebElement blueButn = driver.findElement(By.id("blue"));
        blueButn.click();
        WebElement yellowButn = driver.findElement(By.id("yellow"));
        yellowButn.click();
        WebElement blackButn = driver.findElement(By.id("black"));
        blackButn.click();

        System.out.println(redButn.isDisplayed());
        System.out.println(blackButn.isDisplayed());
        System.out.println(blueButn.isDisplayed());
        System.out.println(yellowButn.isDisplayed());

        List<WebElement> btns=driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement btn:btns){
            btn.click();
            Thread.sleep(1000);
            System.out.println(btn.isEnabled());
        }



    }
}
