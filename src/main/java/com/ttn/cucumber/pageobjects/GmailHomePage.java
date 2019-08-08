package com.ttn.cucumber.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailHomePage extends PageObject {


    @FindBy(how = How.ID, using = "identifierId")
    public static WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id='passwordNext']/span/span")
    public static WebElement nextButtonPassword;

    @FindBy(how = How.XPATH, using = "//*[@id='identifierNext']")
    public static WebElement nextButtonUserName;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'Sign in')])[2]")
    public static WebElement signInIcon;

}
