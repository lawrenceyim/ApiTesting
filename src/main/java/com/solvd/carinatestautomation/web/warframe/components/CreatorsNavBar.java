package com.solvd.carinatestautomation.web.warframe.components;

import com.solvd.carinatestautomation.web.warframe.CreatorsListPage;
import com.solvd.carinatestautomation.web.warframe.CreatorsPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreatorsNavBar extends AbstractUIObject {
    @FindBy(xpath = ".//a[@href='https://www.warframe.com/community/creators']")
    private ExtendedWebElement programOverviewButton;
    @FindBy(xpath = ".//a[@href='https://www.warframe.com/community/creators/list']")
    private ExtendedWebElement creatorsButton;

    public CreatorsNavBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CreatorsListPage pressCreatorsButton() {
        creatorsButton.scrollTo();
        creatorsButton.clickIfPresent(1);
        return new CreatorsListPage(getDriver());
    }

    public CreatorsPage pressProgramOverviewButton() {
        programOverviewButton.scrollTo();
        programOverviewButton.clickIfPresent(1);
        return new CreatorsPage(getDriver());
    }

    public boolean isProgramOverviewButtonPresent() {
        return programOverviewButton.isPresent(1);
    }

    public boolean isCreatorsButtonPresent() {
        return programOverviewButton.isPresent(1);
    }
}
