package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.Test2Step;

public class Test2 extends LoginPage {

    @Steps
    Test2Step test2Step;   //Basically page object of the same class is referred

    @Given("^A am Sankalp$")
    public void Raj_am_Sankalp() throws Throwable {
        System.out.println(">>>>>>>>>>>>>>>++++++++++++++>>>>>>>>>>>>>>>");
        test2Step.def();
        //Assert.fail("??????????????????????????????");
    }

    @When("^I want to open Google$")
    public void i_want_to_open_Google() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        test2Step.def();
        System.out.println("++++++++++++>>>>>>>>>>>>>>>>>>>>>+++++++++++");
    }

    @Then("^Verify Loginn button$")
    public void verify_Loginn_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        test2Step.abc();
        System.out.println("===============++++++++++++++===============");
    }

}
