package stepdefinitions;

import io.cucumber.java.en.Then;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.LocationPage;

public class LocationPageSteps {
    LocationPage locationPage = new LocationPage();
    @Then("The city weather page header should contain {string}")
    @Step("Verify that the city weather page header contains {0}")
    public  void theCityWeatherPageHeaderShouldContain(String expectedCityHeader) {
        String actualCityHeader = locationPage.getHeaderText();
        Assert.assertTrue(actualCityHeader.contains(expectedCityHeader),
                "The city weather page header does not contain the expected text: " + expectedCityHeader);
    }
}
