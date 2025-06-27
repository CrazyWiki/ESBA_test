package pages;

import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SettingsPage extends Form{

    private final IComboBox temperatureSelectDropdown = getElementFactory().getComboBox(
            By.cssSelector("select#unit"), "Temperature select dropdown");
    private final ILink logo = getElementFactory().getLink(By.cssSelector("a.header-logo svg"), "Logo");

    public SettingsPage() {
        super(By.xpath("//h1[normalize-space(text())='settings']"), "Settings Page");
    }
    public void selectFTemperatureUnitByValue() {
        temperatureSelectDropdown.selectByValue("F");
    }
    public void returnToMainPage(){
        logo.click();
    }
}
