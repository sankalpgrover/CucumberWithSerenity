package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.GmailHomePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.ScenarioOutlineStep;

public class ScenarioOutline extends GmailHomePage {
	@Steps
	ScenarioOutlineStep scenarioOutlineStep;

	@Managed
	WebDriver driver;

	@Given("^I am on Gmail homepage$")
	public void i_am_on_Gmail_homepage() throws Throwable {
	scenarioOutlineStep.navigateToUrl(driver);
	}

	@When("^I will login with Username \"(.*?)\" and Password \"(.*?)\"$")
	public void i_will_login_with_and(String userName, String passWord) throws Throwable {
	scenarioOutlineStep.submitUserId(userName);
		scenarioOutlineStep.clickNextOnUserName();
		scenarioOutlineStep.submitPassword(passWord);

	}

	@When("^I will click on Submit button$")
	public void i_will_click_on_Submit_button() throws Throwable {
		scenarioOutlineStep.clickNextOnPassword();
	}

	@Then("^Verify that user lands onto homepage$")
	public void verify_that_user_lands_onto_homepage() throws Throwable {

		System.out.println("Can't login due to bad credentials");
	}

	@Given("^Delete All Cookies$")
	public void delete_All_Cookies() {

	}

	@When("^I reload the url$")
	public void i_reload_the_url() throws InterruptedException {
		scenarioOutlineStep.navigateToUrl(driver);
	}

	@Then("^I should land on to Gmail Home Page$")
	public void i_should_land_on_to_Gmail_Home_Page() {
//		System.out.println("Gmail Home Page !! It is....");
	}

}
