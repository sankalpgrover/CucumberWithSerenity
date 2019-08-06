package com.ttn.cucumber.pageobjects;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver = WebDriverSetup.driver;

    public LoginPage() {
        PageFactory.initElements(driver , this);
    }

    @FindBy(how = How.NAME, using = "email")
    private WebElement emailInput;

    public void submitMail(){
        System.out.println("Driver value inside LoginPage: "+driver);
        emailInput.sendKeys("sankalpgrover@gmail.com");
    }

}
