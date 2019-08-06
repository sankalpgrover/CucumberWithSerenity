package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.LoginPage;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.ScenarioOutlineStep;

public class ScenarioOutline {
	@Steps
	ScenarioOutlineStep scenarioOutlineStep;

	 WebDriver driver = Hooks.driver;

	@Given("^I am on Gmail homepage$")
	public void i_am_on_Gmail_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//driver.navigate().to("https://www.google.com");
		//Thread.sleep(5000);
		// Add Extent logging for each step
		scenarioOutlineStep.def();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@When("^I will login with Username \"(.*?)\" and Password \"(.*?)\"$")
	public void i_will_login_with_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		scenarioOutlineStep.def();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	}

	@When("^I will click on Submit button$")
	public void i_will_click_on_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		scenarioOutlineStep.def();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Assert.fail("+++++++++++++++++++++++++++++++++");
	}

	@Then("^Verify that user lands onto homepage$")
	public void verify_that_user_lands_onto_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		scenarioOutlineStep.def();
		System.out.println("I am on homepage");

	}

}
