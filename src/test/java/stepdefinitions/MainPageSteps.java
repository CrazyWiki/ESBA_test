package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage= new MainPage();

    @Given("I am on the AccuWeather Main Page")
    @Step("Verifying that AccuWeather Main Page is displayed")
    public void iAmOnTheAccuWeatherMainPage() {
        Assert.assertTrue(mainPage.state().isDisplayed(),
                "Main page is not displayed" );
    }

    @When("I input {string} in the search box")
    @Step("Inputting '{0}' into the search box")
    public void inputCityToSearch(String cityToSearch) {
        mainPage.enterSearchText(cityToSearch);
    }
    @When("I select the first search result with the name {string}")
    @Step("Selecting the first search result with name '{0}'")
    public void selectFirstSearchResult(String cityToSearch) {
        mainPage.getSearchResultInDropdown(cityToSearch);
    }
    @Then("Click first recent location on the Main Page")
    @Step("Clicking the first recent location on the Main Page")
    public void clickFirstRecentLocation() {
        mainPage.clickFirstRecentLocation();
    }
    @When("I click the search field")
    @Step("Clicking the search field")
    public void clickSearchField() {
        mainPage.clickSearchField();
    }
    @Then("Ensure that {string} is displayed.")
    @Step("Ensuring that label '{0}' is displayed")
    public void ensureCurrentLocationLabelIsDisplayed(String labelText) {
        Assert.assertTrue(mainPage.getCurrentLocationLabelText().contains(labelText),
                "Use your current location label is not displayed");
    }

    @When("I click header menu")
    @Step("Clicking the header menu button")
    public void clickHeaderMenu() {
        mainPage.clickMenuButton();
    }
    @When("I select Settings from the header menu options")
    @Step("Selecting 'Settings' from the header menu options")
    public void selectSettingsFromHeaderMenu() {
        mainPage.clickSettingsButton();
    }

    @Then("I see that temperature unit to {string}")
    @Step("Verifying that temperature unit is '{0}'")
    public void verifyTemperatureUnitFahrenheit(String temperatureUnit) {
        Assert.assertTrue(mainPage.getTemperatureText().contains(temperatureUnit),
                "Temperature unit is not Fahrenheit"+
                        "Expected: " + temperatureUnit + ", Actual: " + mainPage.getTemperatureText());
    }
}
