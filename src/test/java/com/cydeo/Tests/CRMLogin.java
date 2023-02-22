package com.cydeo.Tests;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMLogin {

    @Test
    public void crmLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //3.enter valid username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        //4.enter valid password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        //5.Click to login button
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }
}
