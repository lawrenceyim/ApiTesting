package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class EndUserLicenseAgreementPage extends AbstractPage {
    public EndUserLicenseAgreementPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("eula_us"));
    }
}
