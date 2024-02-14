package com.solvd.carinatestautomation.web.store.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = ".//a[contains(@href, '/collections/apparel') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement apparelLabel;
    @FindBy(xpath = ".//a[contains(@href, '/collections/accessories') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement accessoriesLabel;
    @FindBy(xpath = ".//a[contains(@href, '/collections/collectibles') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement collectiblesLabel;
    @FindBy(xpath = ".//a[contains(@href, '/collections/home') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement homeLabel;
    @FindBy(xpath = ".//a[contains(@href, '/collections/collections') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement collectionsLabel;
    @FindBy(xpath = ".//a[contains(@href, '/collections/clearance') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement clearanceButton;
    @FindBy(xpath = ".//a[contains(@href, '/account') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement accountButton;
    @FindBy(xpath = ".//a[contains(@href, '/search') and contains(@class, 'site-nav__link')]")
    private ExtendedWebElement searchButton;
    @FindBy(xpath = ".//input[@type='search' and contains(@class, 'site-header__search-input')]")
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
