package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownlist_Multiple {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/dropdown");

        //identify the dropdown with multiple select options
        WebElement multiItemDropdown=driver.findElement(By.name("Languages"));

        //wrap this element into select object
        Select multiItemSelect=new Select(multiItemDropdown);

        //check if this element has multi select option
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        //select Items
        multiItemSelect.selectByIndex(1);
        multiItemSelect.selectByValue("python");
        multiItemSelect.selectByVisibleText("Ruby");
        Thread.sleep(3000);

        //deselect Items
       // multiItemSelect.deselectByIndex(1);
      //  multiItemSelect.deselectByValue("python");
       // multiItemSelect.deselectByVisibleText("Ruby");
       multiItemSelect.deselectAll();
    }
}
