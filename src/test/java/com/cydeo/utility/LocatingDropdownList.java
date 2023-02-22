package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        //identify the select element
        WebElement dropDownElm=driver.findElement(By.id("dropdown"));

        //Wrap this element inside select option
        Select selectObj=new Select(dropDownElm);

        //use ready methods to select option
        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        //verify determined option is selected
        String expectedOpt="Option 2";
        String actualOpt=selectObj.getFirstSelectedOption().getText();
        if (actualOpt.equals(expectedOpt)){
            System.out.println("Option 2 selection passed");
        }else {
            System.out.println("Option 2 selection failed");
        }
    }
}
