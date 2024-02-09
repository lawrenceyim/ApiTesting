package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.components.HeaderComponent;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div")
    HeaderComponent headerComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url"));
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }

    public void setHeaderComponent(HeaderComponent headerComponent) {
        this.headerComponent = headerComponent;
    }
}
