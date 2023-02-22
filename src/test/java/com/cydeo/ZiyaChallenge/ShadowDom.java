package com.cydeo.ZiyaChallenge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.alodokter.com/");

       // WebElement inputBox= driver.findElement(By.cssSelector(""));

        JavascriptExecutor js=(JavascriptExecutor) driver;

        String str="document.querySelector(\"hero-view\").shadowRoot.querySelector(\"#searchSpecialities\").value=\"Ziya\";";
        js.executeScript(str);
    }
}
