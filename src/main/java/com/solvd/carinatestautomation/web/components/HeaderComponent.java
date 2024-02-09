package com.solvd.carinatestautomation.web.components;

import com.solvd.carinatestautomation.web.RotatingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends AbstractUIObject {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/a")
    private ExtendedWebElement headerNavButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[1]/a")
    private ExtendedWebElement rotatingLinkButton;

    public HeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public void pressHeaderNavButton() {
        headerNavButton.click();
    }
    public RotatingPage pressRotatingLinkButton() {
        rotatingLinkButton.click();
        return new RotatingPage(getDriver());
    }

    public ExtendedWebElement getHeaderNavButton() {
        return headerNavButton;
    }

    public void setHeaderNavButton(ExtendedWebElement headerNavButton) {
        this.headerNavButton = headerNavButton;
    }

    public ExtendedWebElement getRotatingLinkButton() {
        return rotatingLinkButton;
    }

    public void setRotatingLinkButton(ExtendedWebElement rotatingLinkButton) {
        this.rotatingLinkButton = rotatingLinkButton;
    }
}
