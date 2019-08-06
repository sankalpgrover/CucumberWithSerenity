package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import steps.JabongLoginStep;

public class Jabonglogin {

    // Using Steps and Step, page object is automatically instantiated and method name is populated in Serenity report
    @Steps
    JabongLoginStep jabongLoginStep;

    @Given("^I am a registered User with Jabong\\.com$")
    public void i_am_a_registered_User_with_Jabong_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jabongLoginStep.abc();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @When("^I click on Sign In$")
    public void i_click_on_Sign_In() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jabongLoginStep.abc();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jabongLoginStep.abc();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @Then("^I am successfully logged in$")
    public void i_am_successfully_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        jabongLoginStep.abc();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Assert.fail("+++++++++++++++++++++++++");
    }

}
