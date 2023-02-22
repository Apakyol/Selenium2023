package com.cydeo.Week02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //find element
        //this method is using locator to locate
        //
        //1.id

        driver.get("https://zoom.us/");
        WebElement cookies= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

        cookies.click();

        WebElement foot=driver.findElement(By.id("page-footer"));
        System.out.println(foot.getText());
        System.out.println(foot.getTagName());

        //2.text link
        WebElement brokenLink=driver.findElement(By.linkText("Broken Images"));
        System.out.println(brokenLink.getText());
        brokenLink.click();


        //3.partial link text
        WebElement checkBox=driver.findElement(By.partialLinkText("referrer"));
        System.out.println(checkBox.getText());

        WebElement dynamicLoading=driver.findElement(By.partialLinkText("Dynamic"));
        System.out.println(dynamicLoading.getText());//dynamic loading

        //4.name
        WebElement meta=driver.findElement(By.name("viewport"));
        System.out.println(meta.getTagName());

        //5.class name
        WebElement title=driver.findElement(By.className("h1"));
        System.out.println(title.getText());

        WebElement secondTitle=driver.findElement(By.className("h2"));
        System.out.println(secondTitle.getText());

        //6.tagName
       // 1,tagname[IAttributeName='Value']
        //2. tagname.classValue
        //div.p-container>div.p-progress
        //
        WebElement tagTitle=driver.findElement(By.tagName("h1"));
        System.out.println(tagTitle.getText());
        System.out.println(tagTitle.getTagName());

        //7.
    }
}
