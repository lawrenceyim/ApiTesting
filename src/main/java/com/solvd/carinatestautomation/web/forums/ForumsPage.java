package com.solvd.carinatestautomation.web.forums;

import com.solvd.carinatestautomation.web.forums.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
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

    // Page is opening with the wrong URL
    // The URL is being appended to the url from _config.properties
    public ForumsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        setPageAbsoluteURL(Configuration.getRequired("forums_home_url"));
    }

    public void searchForums(String searchInput) {
        searchInputBar.scrollTo();
        searchInputBar.type(searchInput);
        searchSubmitButton.clickIfPresent(1);
    }
}
