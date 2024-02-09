package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[2]/a") // Only on landing page
    private ExtendedWebElement continueToHomeButton;

    public LandingPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") + "/landing");
    }

    public void pressGoToHomeButton() {
        continueToHomeButton.click();
    }
}
