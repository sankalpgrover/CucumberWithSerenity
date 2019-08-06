package steps;

import com.ttn.stepdefinition.Hooks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class JabongLoginStep {

    WebDriver driver= Hooks.driver;

    @Step("Sankalp Works with TTN")
    public void abc(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        driver.get("https://www.google.com");
    }

    @Step("I am new to Cucumber")
    public void def(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        driver.get("https://www.facebook.com");
    }
}
