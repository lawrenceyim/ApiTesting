package com.solvd.carinatestautomation.web.forums;

import com.solvd.carinatestautomation.web.forums.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ForumsPage extends AbstractPage {
    @FindBy(id = "site_header")
    private Header header;
    @FindBy(xpath = "//input[@type='search' and @id='elSearchField']")
    private ExtendedWebElement searchInputBar;
    @FindBy(xpath = "//button[@class='cSearchSubmit']")
    private ExtendedWebElement searchSubmitButton;

    public ForumsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("forums_home_url"));
    }

    public void searchForums(String searchInput) {
        searchInputBar.scrollTo();
        searchInputBar.type(searchInput);
        searchSubmitButton.clickIfPresent(1);
    }

    public void pressHomeButton() {
        header.pressHomeButton();
    }
}
