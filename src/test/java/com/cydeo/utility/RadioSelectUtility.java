package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioSelectUtility {
//1. WebDriver
    public static void clickAndVerifyRadioButton(WebDriver driver, String name,String ID){
//2. Name attribute as String (for providing which group of radio buttons)
        for (WebElement each:driver.findElements(By.name(name))){

            System.out.println(each.getAttribute("name"));

            System.out.println(each.getAttribute("ID"));


        }






    }

}
