package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserName) {
        WebDriver driver;

        switch (browserName.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    WebDriver driver2 = new FirefoxDriver();
                    driver2.manage().window().maximize();

                    default:
                        System.out.println("unknown Browser Type" + browserName);
                        driver=null;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return driver;

    }
}


