package com.cydeo.Tests;

import com.cydeo.week5.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class ActionsClass extends TestBase {
    @Test
    public void dragAndDropTest() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle=driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));
        WebElement alertBtn=driver.findElement(By.id("onetrust-accept-btn-handler"));
        alertBtn.click();

        Actions actions=new Actions(driver);
        actions.moveToElement(smallCircle).pause(1000);
        actions.dragAndDrop(smallCircle,bigCircle).perform();
                 /*actions.clickAndHold().pause(3000);
                 actions.moveToElement(bigCircle).pause(3000)
                 .release().perform();
                  */

               Assert.assertEquals(bigCircle.getText(),"You did great!");

    }
    @Test
    public void hoverTest() {
        driver.get("https://practice.cydeo.com/hovers");
        WebElement img1=driver.findElement(By.xpath("(//img[1])"));
        WebElement img1Text=driver.findElement(By.xpath("//h5[text()='name: user1']"));
        //WebElement img1Text1= driver.findElement(By.xpath("(//h5)[1]"));

        Actions actions=new Actions(driver);

        actions.moveToElement(img1).perform();
        assertTrue(img1Text.isDisplayed());

        List<WebElement> images=driver.findElements(By.tagName("img"));

        for (WebElement img : images){
            actions.moveToElement(img).pause(2000).perform();
        }
    }

}
