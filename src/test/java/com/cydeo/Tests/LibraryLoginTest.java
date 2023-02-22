package com.cydeo.Tests;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage=new LibraryLoginPage();

        loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("library3.student.email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.signInBtn.click();
 }



    @Test
    public void negativeLogintest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage=new LibraryLoginPage();

        loginPage.inputEmail.sendKeys("asdfa@sfadsf");
        loginPage.password.sendKeys("adfasdfa");
        loginPage.signInBtn.click();
    }

}
