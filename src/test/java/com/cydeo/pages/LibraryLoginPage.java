package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1.initialize the driver instance and object of the class
    public LibraryLoginPage(){

       PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id ="inputEmail")
    public WebElement inputEmail;

    @FindBy (id ="inputPassword")
    public WebElement password;


    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement errorMsg;

    @FindBy (xpath = "//div[@id='inputEmail-error']")
    public WebElement errorMailMsg;



}
