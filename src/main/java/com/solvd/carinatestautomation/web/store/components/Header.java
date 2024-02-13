package com.solvd.carinatestautomation.web.store.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//a[contains(@href, '/collections/apparel') and @class='site-nav__link site-nav__link--has-dropdown']")
    private ExtendedWebElement apparelLabel;
    @FindBy(xpath = "//a[contains(@href, '/collections/accessories') and @class='site-nav__link site-nav__link--has-dropdown']")
    private ExtendedWebElement accessoriesLabel;
    @FindBy(xpath = "//a[contains(@href, '/collections/collectibles') and @class='site-nav__link site-nav__link--has-dropdown']")
    private ExtendedWebElement collectiblesLabel;
    @FindBy(xpath = "//a[contains(@href, '/collections/home') and @class='site-nav__link site-nav__link--has-dropdown']")
    private ExtendedWebElement homeLabel;
    @FindBy(xpath = "//a[contains(@href, '/collections/collections') and @class='site-nav__link site-nav__link--has-dropdown']")
    private ExtendedWebElement collectionsLabel;
    @FindBy(xpath = "//a[contains(@href, '/collections/clearance') and @class='site-nav__link']")
    private ExtendedWebElement clearanceButton;
    @FindBy(xpath = "//a[contains(@href, '/account') and @class='site-nav__link site-nav__link--icon medium-down--hide']")
    private ExtendedWebElement accountButton;
    @FindBy(xpath = "//a[contains(@href, '/search') and @class='site-nav__link site-nav__link--icon js-search-header js-no-transition']")
    private ExtendedWebElement searchButton;
    @FindBy(xpath = "//input[@type='search' and @class='site-header__search-input']")
    private ExtendedWebElement searchInputBar;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void searchStore(String searchInput) {
        searchButton.scrollTo();
        searchButton.clickIfPresent(1);
        searchInputBar.type(searchInput);
        searchInputBar.sendKeys(Keys.ENTER);
    }
}
