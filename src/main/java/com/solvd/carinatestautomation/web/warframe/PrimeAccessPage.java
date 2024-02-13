package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.forums.components.Header;
import com.solvd.carinatestautomation.web.warframe.components.Footer;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PrimeAccessPage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;
    @FindBy(id = "footer")
    private Footer footer;

    public PrimeAccessPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("prime_access_url"));
    }
}
