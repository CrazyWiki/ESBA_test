package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.EnvDataReader;

public class Hooks {
    @Before()
    public void setup() {
        Browser browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(EnvDataReader.getEnvData().getHost());

    }
    @After
    public void tearDown() {
        Browser browser = AqualityServices.getBrowser();
        if (browser != null && browser.isStarted()) {
            browser.quit();
        }
    }
}
