package com.solvd.carinatestautomation.web.store;

import com.solvd.carinatestautomation.web.store.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class StorePage extends AbstractPage {
    @FindBy(xpath = "//header[@class='site-header']")
    private Header header;

    public StorePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("store_home_url"));
    }

    public boolean isHeaderPresent() {
        return header.isUIObjectPresent(1);
    }

    public void searchStore(String searchInput) {
        header.searchStore(searchInput);
    }
}
