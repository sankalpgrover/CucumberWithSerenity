package steps;

import com.ttn.cucumber.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class TestDataTableStep {


    @Step
    public void navigateToUrl(WebDriver driver) {
        driver.navigate().to("https://www.jabong.com/");
    }

    @Step
    public void submitUserId(String userId){
        LoginPage.userName.clear();
        LoginPage.userName.sendKeys(userId);
    }

    @Step
    public void submitPassword(String password){
        LoginPage.password.clear();
        LoginPage.password.sendKeys(password);
    }

    @Step
    public void hitSubmitButton(){
        LoginPage.submitButton.click();
    }

    @Step
    public void clcikSignIn(){
        LoginPage.signIn.click();
    }

}
