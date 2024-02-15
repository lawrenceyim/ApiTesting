package com.solvd.carinatestautomation.web.warframe;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class MobileAppPage extends AbstractPage {
    public MobileAppPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("mobile_app_url"));
    }
}
