package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RotatingPage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;

    public RotatingPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("rotating_url"));
    }
}
