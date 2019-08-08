package steps;

import com.ttn.cucumber.pageobjects.GmailHomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class ScenarioOutlineStep {

    @Step
    public void navigateToUrl(WebDriver driver) {
        driver.navigate().to("https://accounts.google.com/signin");
    }

    @Step
    public void submitUserId(String userId){
        GmailHomePage.userName.clear();
        GmailHomePage.userName.sendKeys(userId);
    }

    @Step
    public void submitPassword(String password){
        GmailHomePage.password.clear();
        GmailHomePage.password.sendKeys(password);
    }

    @Step
    public void clickNextOnUserName() throws InterruptedException {
        GmailHomePage.nextButtonUserName.click();
        Thread.sleep(50);
    }

    @Step
    public void clickNextOnPassword() throws InterruptedException {
        GmailHomePage.nextButtonPassword.click();
        Thread.sleep(50);
    }

    @Step
    public void clickSignIn(){
        GmailHomePage.signInIcon.click();
    }
}
