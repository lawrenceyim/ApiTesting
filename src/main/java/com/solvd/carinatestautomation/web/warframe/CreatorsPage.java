package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.warframe.components.CreatorsNavBar;
import com.solvd.carinatestautomation.web.warframe.components.Footer;
import com.solvd.carinatestautomation.web.warframe.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreatorsPage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;
    @FindBy(id = "footer")
    private Footer footer;
    @FindBy(id = "mainContent")
    private CreatorsNavBar creatorsNavBar;

    public CreatorsPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("creators_url"));
    }

    public boolean isHeaderPresent() {
        return header.isUIObjectPresent(1);
    }

    public CreatorsListPage pressCreatorsButton() {
        return creatorsNavBar.pressCreatorsButton();
    }

    public CreatorsPage pressProgramOverviewButton() {
        return creatorsNavBar.pressProgramOverviewButton();
    }

    public boolean isProgramOverviewButtonPresent() {
        return creatorsNavBar.isProgramOverviewButtonPresent();
    }

    public boolean isCreatorsButtonPresent() {
        return creatorsNavBar.isCreatorsButtonPresent();
    }
}
