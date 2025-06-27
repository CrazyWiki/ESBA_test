package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.EnvDataReader;

import java.time.Duration;

public class LocationPage extends Form {
    private final ILabel cityHeaderLabel = getElementFactory().getLabel(
            By.xpath("//*[contains(@class, 'header') and contains(@class, 'loc')]"), "Header with city name");
    public LocationPage(){
        super(By.xpath("//a[@data-qa='now']"), "Location Page");
    }

    public String getHeaderText() {
        cityHeaderLabel.state().waitForNotDisplayed();
        return cityHeaderLabel.getText().trim();
    }
}
