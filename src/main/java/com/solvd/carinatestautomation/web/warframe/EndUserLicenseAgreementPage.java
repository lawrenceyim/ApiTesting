package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.warframe.components.HeaderButton;
import com.solvd.carinatestautomation.web.warframe.components.WarframeFooter;
import com.solvd.carinatestautomation.web.warframe.components.WarframeHeader;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EndUserLicenseAgreementPage extends AbstractPage implements IWarframeHeader {
    @FindBy(id = "header")
    private WarframeHeader warframeHeader;
    @FindBy(id = "footer")
    private WarframeFooter warframeFooter;

    public EndUserLicenseAgreementPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url") +
                Configuration.getRequired("eula_us"));
    }

    @Override
    public AbstractPage pressHeaderButton(HeaderButton button) {
        return warframeHeader.pressButton(button);
    }
}
