package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class TermsOfUsePage extends AbstractPage {
    public TermsOfUsePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("terms_url"));
    }
}
