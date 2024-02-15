package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.warframe.components.CreatorsNavBar;
import com.solvd.carinatestautomation.web.warframe.components.WarframeFooter;
import com.solvd.carinatestautomation.web.warframe.components.WarframeHeader;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreatorsListPage extends AbstractPage {
    @FindBy(id = "header")
    private WarframeHeader warframeHeader;
    @FindBy(id = "footer")
    private WarframeFooter warframeFooter;
    @FindBy(id = "mainContent")
    private CreatorsNavBar creatorsNavBar;

    public CreatorsListPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("creators_list_url"));
    }

    public boolean isHeaderPresent() {
        return warframeHeader.isUIObjectPresent(1);
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
