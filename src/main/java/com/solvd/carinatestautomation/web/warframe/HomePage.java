package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.warframe.components.Footer;
import com.solvd.carinatestautomation.web.warframe.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;
    @FindBy(id = "footer")
    private Footer footer;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url"));
    }

    public Header getHeader() {
        return header;
    }
    public Footer getFooter() {
        return footer;
    }
}
