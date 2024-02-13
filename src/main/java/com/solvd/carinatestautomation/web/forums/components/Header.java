package com.solvd.carinatestautomation.web.forums.components;

import com.solvd.carinatestautomation.web.store.StorePage;
import com.solvd.carinatestautomation.web.warframe.CreatorsListPage;
import com.solvd.carinatestautomation.web.warframe.HomePage;
import com.solvd.carinatestautomation.web.warframe.PrimeAccessPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//a[contains(@href, 'http://forums.warframe.com')]")
    private ExtendedWebElement homebutton;
    @FindBy(xpath = "//a[contains(@href, 'http://warframe.com/news')]")
    private ExtendedWebElement newsButton;
    @FindBy(xpath = "//a[contains(@href, 'https://www.warframe.com/community/creators/list')]")
    private ExtendedWebElement creatorsButton;
    @FindBy(xpath = "//a[contains(@href, 'http://store.warframe.com/')]")
    private ExtendedWebElement storeButton;
    @FindBy(xpath = "//a[contains(@href, 'https://warframe.com/prime-access')]")
    private ExtendedWebElement primeAccessButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void pressHomeButton() {
        homebutton.scrollTo();
        homebutton.clickIfPresent(1);
    }

    public HomePage pressNewsButton() {
        newsButton.scrollTo();
        newsButton.clickIfPresent(1);
        return new HomePage(getDriver());
    }

    public CreatorsListPage pressCreatorsButton() {
        creatorsButton.scrollTo();
        creatorsButton.clickIfPresent(1);
        return new CreatorsListPage(getDriver());
    }

    public StorePage pressStoreButton() {
        storeButton.scrollTo();
        storeButton.clickIfPresent(1);
        return new StorePage(getDriver());
    }

    public PrimeAccessPage pressPrimeAccessButton() {
        primeAccessButton.scrollTo();
        primeAccessButton.clickIfPresent(1);
        return new PrimeAccessPage(getDriver());
    }
}
