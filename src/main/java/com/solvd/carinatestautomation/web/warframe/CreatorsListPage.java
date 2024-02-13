package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.warframe.components.Footer;
import com.solvd.carinatestautomation.web.warframe.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CreatorsListPage extends AbstractPage {
    @FindBy(id = "header")
    private Header header;
    @FindBy(id = "footer")
    private Footer footer;
    // xpath for creators nav buttons are different in the creators and creators list page so a component can't be created
    @FindBy(xpath = "//a[contains(@href, 'https://www.warframe.com/community/creators') and @class='navBtn apply ']")
    private ExtendedWebElement programOverviewButton;
    @FindBy(xpath = "//a[contains(@href, 'https://www.warframe.com/community/creators/list') and @class='navBtn creators  active ']")
    private ExtendedWebElement creatorsButton;

    public CreatorsListPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("creators_list_url"));
    }

    public boolean isHeaderPresent() {
        return header.isUIObjectPresent(1);
    }

    public void pressCreatorsButton() {
        creatorsButton.scrollTo();
        creatorsButton.clickIfPresent(1);
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
