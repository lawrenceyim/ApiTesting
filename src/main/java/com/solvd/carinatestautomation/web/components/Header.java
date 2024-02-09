package com.solvd.carinatestautomation.web.components;

import com.solvd.carinatestautomation.web.HomePage;
import com.solvd.carinatestautomation.web.PlayWarframeYouTubePage;
import com.solvd.carinatestautomation.web.RotatingPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//div[@id='header']//a[contains(@href, 'https://www.warframe.com')]")
    private ExtendedWebElement headerNavButton;
    @FindBy(xpath = "//div[@id='header']//div[@class='HeaderMenuItem is-highlighted']")
    private ExtendedWebElement rotatingButton;
    @FindBy(xpath = "//div[@id='header']/div[@class='HeaderNavigationBar is-desktop']//div[@class='HeaderDesktopMenu']/div[@class='HeaderMenuItem HeaderMenuItem--external']/a")
    private ExtendedWebElement videosButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage pressHeaderNavButton() {
        headerNavButton.click();
        return new HomePage(getDriver());
    }

    public RotatingPage pressRotatingButton() {
        rotatingButton.click();
        return new RotatingPage(getDriver());
    }

    public PlayWarframeYouTubePage pressVideosButton() {
        videosButton.click();
        return new PlayWarframeYouTubePage(getDriver());
    }
}
