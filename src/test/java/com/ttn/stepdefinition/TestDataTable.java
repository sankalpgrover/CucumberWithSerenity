package com.ttn.stepdefinition;

import com.ttn.cucumber.pageobjects.LoginPage;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.TestDataTableStep;


public class TestDataTable extends LoginPage {

	@Steps
	TestDataTableStep testDataTableStep;

	WebDriver driver = Hooks.driver;
	LoginPage loginPage = new LoginPage();

	@Given("^I am on CW homepage$")
	public void i_am_on_Gmail_homepage() throws Throwable {

		System.out.println("Driver value in data table: " +driver);
		testDataTableStep.abc();
		//driver.navigate().to("https://www.toolsqa.com/selenium-c-sharp");
		//Thread.sleep(5000);
		//loginPage.submitMail();
	}

	@When("^I will login with Username and Password$")
	public void i_will_login_with_and(DataTable usercredentials) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("))))))))))))))))))))))))---------((((((((((((((((((((((");
		testDataTableStep.def();
	}

	@When("^I will click on Sign button$")
	public void i_will_click_on_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		testDataTableStep.abc();
		System.out.println(">>>>>>>>>>>>>>>++++++++++++++++++++>>>>>>>>>>>>>>>>>");
	}

	@Then("^Verify that user lands  homepage$")
	public void verify_that_user_lands_onto_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		testDataTableStep.def();
		System.out.println("I am on homepage");
	}
}
