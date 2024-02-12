package com.solvd.carinatestautomation.web.warframe;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class PrivacyPolicyPage extends AbstractPage {
    public PrivacyPolicyPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("privacy_url"));
    }
}
