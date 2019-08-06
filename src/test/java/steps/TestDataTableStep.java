package steps;

import com.ttn.stepdefinition.Hooks;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class TestDataTableStep {

    WebDriver driver= Hooks.driver;

    @Step
    public void abc(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        driver.get("https://www.google.com");
    }

    @Step
    public void def(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        driver.get("https://www.facebook.com");
    }
}
