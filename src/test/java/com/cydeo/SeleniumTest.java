package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //driver navigate to google.com
        driver.navigate().to("https:www.google.com");


        //search for cydeo
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Apple Türkiye"+ Keys.ENTER);

        //verify Apple Türkiye lintText is appeared in the results

        WebElement cydeoText=driver.findElement(By.xpath("//h3[.='Apple (Türkiye)']"));
        //close the browser
        if (cydeoText.getText().equals("Apple (Türkiye)")){
            System.out.println("Apple (Türkiye) is appeared");
        }else {
            System.out.println("Apple Türkiye did not appeared");
        }
        driver.quit();

    }
}
