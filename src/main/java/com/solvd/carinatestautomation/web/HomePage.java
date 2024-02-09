package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/a")
    private ExtendedWebElement headerNavButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[1]/a")
    private ExtendedWebElement rotatingLinkButton;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url"));
    }

    public void pressHeaderNavButton() {
        headerNavButton.click();
    }
    public void pressRotatingLinkButton() {
        rotatingLinkButton.click();
    }
}
