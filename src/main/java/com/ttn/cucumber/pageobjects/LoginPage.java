package com.ttn.cucumber.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageObject {


    @FindBy(how = How.ID, using = "login-email")
    public static WebElement userName;

    @FindBy(how = How.ID, using = "login-pwd")
    public static WebElement password;

    @FindBy(how = How.ID, using = "btn-login")
    public static WebElement submitButton;

    @FindBy(how = How.NAME, using = "signin-parent")
    public static WebElement signIn;


}
