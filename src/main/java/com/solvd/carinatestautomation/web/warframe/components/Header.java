package com.solvd.carinatestautomation.web.warframe.components;

import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.solvd.carinatestautomation.web.warframe.HomePage;
import com.solvd.carinatestautomation.web.warframe.RotatingPage;
import com.solvd.carinatestautomation.web.youtube.PlayWarframeYouTubePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com')]")
    private ExtendedWebElement headerNavButton;
    @FindBy(xpath = ".//div[@class='HeaderMenuItem is-highlighted']")
    private ExtendedWebElement rotatingButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//div[@id='drpNavCommunity']")
    private ExtendedWebElement communityDropdownLabel;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://forums.warframe.com')]")
    private ExtendedWebElement forumsButton;
    @FindBy(xpath = "./div[@class='HeaderNavigationBar is-desktop']//div[@class='HeaderDesktopMenu']/div[@class='HeaderMenuItem HeaderMenuItem--external']/a")
    private ExtendedWebElement videosButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage pressHeaderNavButton() {
        headerNavButton.scrollTo();
        headerNavButton.clickIfPresent(1);
        return new HomePage(getDriver());
    }

    public RotatingPage pressRotatingButton() {
        rotatingButton.scrollTo();
        rotatingButton.clickIfPresent(1);
        return new RotatingPage(getDriver());
    }


    public ForumsPage pressForumsButton() {
        communityDropdownLabel.scrollTo();
        communityDropdownLabel.hover();
        forumsButton.clickIfPresent(1);
        return new ForumsPage(getDriver());
    }

    public PlayWarframeYouTubePage pressVideosButton() {
        videosButton.scrollTo();
        videosButton.clickIfPresent(1);
        return new PlayWarframeYouTubePage(getDriver());
    }
}
