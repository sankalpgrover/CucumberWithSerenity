package com.ttn.cucumber.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverSetup {
        public static WebDriver driver;

        /*public WebDriver getDriver() {
            return driver;
        }*/

        public WebDriver getWebDriver(String browser){
            //String currentWebDriver = System.getProperty("browser", "");

            switch(browser) {
                case ("chrome"):
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("disable-infobars");
                    WebDriverManager.chromedriver().version("2.40").setup();
                    driver = new ChromeDriver(options);
                    break;
                case ("firefox"):
                    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    //firefoxOptions.setCapability("marionette", true);
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case ("chromeHeadless"):
                    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                    ChromeOptions chromeHeadless = new ChromeOptions();
                    //chromeHeadless.setHeadless(true);
                    driver = new ChromeDriver(chromeHeadless);
                    break;
                case ("iexplorer"):
                    System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
                case ("edge"):
                    System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
                    driver = new EdgeDriver();
                    break;
                default:
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("disable-infobars");
                    WebDriverManager.chromedriver().version("2.40").setup();
                    driver = new ChromeDriver(option);
                    break;
            }
            return driver;
        }
}

