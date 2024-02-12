package com.solvd.carinatestautomation.web.digitalextremes;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class DigitalExtremesPage extends AbstractPage {
    public DigitalExtremesPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("digital_extremes_url"));
    }
}
