package com.solvd.carinatestautomation.web.store;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class StorePage extends AbstractPage {
    public StorePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("store_home_url"));
    }
}
