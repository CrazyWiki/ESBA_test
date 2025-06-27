package stepdefinitions;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

public class BrowserSteps {

    @When("I go back to the main page using browser navigation")
    @Step("Go back using browser navigation")
    public void goBack() {
        AqualityServices.getBrowser().goBack();
    }
}
