package com.cydeo.Tests;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestPomPractice {
    /*
    TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
NOTE: FOLLOW POM DESIGN PATTERN
     */
    @Test
    public void signIntest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("library1.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.signInBtn.click();

        Assert.assertTrue(loginPage.errorMailMsg.isDisplayed());
        //Assert.assertTrue(loginPage.errorMsg.isDisplayed());
    }

}
