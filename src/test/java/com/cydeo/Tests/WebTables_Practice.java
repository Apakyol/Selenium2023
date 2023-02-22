package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Practice extends TestBase {

    @Test
    public void webTablesTest() throws InterruptedException {

        driver.get("https://practice.cydeo.com/web-tables");
        //print out the Bart Fisher from the text
        WebElement BartFisher = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr[5]//td[2]"));

        WebElement BartF = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr//td[.='Bart Fisher']"));
        System.out.println("BartFisher.getText() = " + BartFisher.getText());
        System.out.println("BartF.getText() = " + BartF.getText());

        //print out all cells in row 4
        List<WebElement> allRaw3Cells = driver.findElements(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl02_OrderSelector']"));

        for (WebElement raw3Cell : allRaw3Cells) {
            System.out.println("raw3Cell.getText() = " + raw3Cell.getText());
        }
    }
}
