package stepdefinitions;

import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import pages.SettingsPage;

public class SettingsPageSteps {
    SettingsPage settingsPage = new SettingsPage();
    @Then("I select Imperial units")
    @Step("Select Imperial units in settings")
    public void selectImperialUnits() {
        settingsPage.selectFTemperatureUnitByValue();
    }
}
