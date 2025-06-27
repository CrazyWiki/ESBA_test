package pages;

import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import utils.EnvDataReader;

import java.time.Duration;


public class MainPage extends Form {
    private final ITextBox searchInput = getElementFactory().getTextBox(By.cssSelector("input[name='query']"), "Input field");
    private final ILink temperatureLabel = getElementFactory().getLink(By.className("recent-location-temp-unit"), "Temperature label");
    private final IButton menuButton = getElementFactory().getButton(By.cssSelector("svg[data-qa='navigationMenu']"), "Menu button");
    private final IButton SettingsButton = getElementFactory().getButton(By.cssSelector("svg.icon-settings"), "Settings button");
    private final IElement overlay = getElementFactory().getLabel(By.xpath("//*[contains(@style, 'fixed') or contains(@class, 'overlay')]"), "Overlay");

    public MainPage() {
        super(By.xpath("//input[@name='query']"), "Main Page");
    }

    public void enterSearchText(String inputText) {
        searchInput.clearAndType(inputText);
    }
    public void clickSearchField() {
        searchInput.state().waitForClickable();
        searchInput.click();
    }

    public String getCurrentLocationLabelText() {
        ILabel currentLocationLabel = getElementFactory().getLabel(By.xpath("//span[@class='current-location-text']"), "Current location label");
        currentLocationLabel.state().waitForDisplayed();
        return currentLocationLabel.getText();
    }
    public void getSearchResultInDropdown(String LocationText) {
        String dynamicXpath = "//p[@class='search-bar-result__name' and normalize-space(text())='" + LocationText + "']";
        ILink firstResult = getElementFactory().getLink(By.xpath("( " + dynamicXpath + " )[1]"), "First search result");
        firstResult.state().waitForClickable();
        firstResult.click();
    }

    public String getTemperatureText() {
        temperatureLabel.state().waitForDisplayed();
        return temperatureLabel.getText();
    }
    public void clickFirstRecentLocation() {
        ILink firstRecentLocation = getElementFactory().getLink(By.xpath("(//a[contains(@class, 'recent-location-item')])[1]"), "First recent location");
        firstRecentLocation.state().waitForClickable();
        firstRecentLocation.click();
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickSettingsButton() {
        SettingsButton.click();
    }


}
