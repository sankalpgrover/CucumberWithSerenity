package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.TestDataTableStep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestDataTable extends LoginPage {

	@Steps
	TestDataTableStep testDataTableStep;

	@Managed
	WebDriver driver;

	@Given("^I am on Jabong homepage$")
	public void i_am_on_Jabong_homepage() throws InterruptedException {
		testDataTableStep.navigateToUrl(driver);
		Thread.sleep(45);
	}

	@When("^I enter invalid credentials$")
	public void i_enter_invalid_credentials(DataTable userCredentials) throws InterruptedException {
		testDataTableStep.clcikSignIn();
		Thread.sleep(45);

		List<List<String>> credentials = userCredentials.raw();
		for(int user = 0 ; user < credentials.size() ; user++){
			testDataTableStep.submitUserId(credentials.get(user).get(0));
			testDataTableStep.submitPassword(credentials.get(user).get(1));
			testDataTableStep.hitSubmitButton();
			Thread.sleep(20);
		}
	}

	@When("^I hit Submit Button$")
	public void i_hit_Submit_Button() {
		//testDataTableStep.hitSubmitButton();
	}

	@Then("^Error should be thrown$")
	public void error_should_be_thrown() {
		System.out.println("Can't Login due to invalid credentials");
	}

	@Given("^I am on  homepage$")
	public void i_am_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		testDataTableStep.navigateToUrl(driver);
	}

	@When("^I input invalid credentials$")
	public void i_input_invalid_credentials(DataTable usercredentials) throws InterruptedException {
		testDataTableStep.clcikSignIn();
		Thread.sleep(45);

		List<Map<String,String>> credsList = usercredentials.asMaps(String.class,String.class);

		for(int user = 0 ; user < credsList.size() ; user++){

			testDataTableStep.submitUserId(credsList.get(user).get("UserName"));
			testDataTableStep.submitPassword(credsList.get(user).get("Password"));
			testDataTableStep.hitSubmitButton();
			Thread.sleep(20);
		}
	}

	@When("^press Submit Button$")
	public void press_Submit_Button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("-------------------------");
	}

	@Then("^Erros on Login form should be displayed$")
	public void erros_on_Login_form_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("can't login with bad credentials");
	}


}
