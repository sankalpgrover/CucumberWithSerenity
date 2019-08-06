package com.ttn.stepdefinition;

import java.io.File;
import java.io.IOException;
import com.ttn.cucumber.pageobjects.WebDriverSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends WebDriverSetup {
	public static WebDriver driver;
	WebDriverSetup webDriverSetup = new WebDriverSetup();

	@Before
	public void openBrowser() throws Throwable{
		driver = webDriverSetup.getWebDriver("chrome");
		System.out.println("Driver value inside before hook: "+driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@After
	public void embedScreenshot(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {
			try {
				//scenario.write("Current Page URL is " + driver.getCurrentUrl());
				scenario.write("Current Page URL can not be navigated" );
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot, new File(
						System.getProperty("user.dir")+"/screenshot/" + scenario.getName()));
				// byte[] screenshot = ((TakesScreenshot)
				// driver).getScreenshotAs(OutputType.BYTES);
				// scenario.embed(screenshot, "image");
				
				// works to embed screenshots in html report but not in Extent
				// Report
				System.out.println(System.getProperty("user.dir")+"/resources/screenshot/" + scenario.getName()
						+ scenario.getId());
				//Reporter.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshot/" + scenario.getName());
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}
		}
		driver.quit();
	}
}
