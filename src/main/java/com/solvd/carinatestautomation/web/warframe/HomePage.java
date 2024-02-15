package com.solvd.carinatestautomation.web.warframe;

import com.solvd.carinatestautomation.web.digitalextremes.DigitalExtremesPage;
import com.solvd.carinatestautomation.web.warframe.components.HeaderButton;
import com.solvd.carinatestautomation.web.warframe.components.WarframeFooter;
import com.solvd.carinatestautomation.web.warframe.components.WarframeHeader;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage implements IWarframeHeader {
    @FindBy(id = "header")
    private WarframeHeader warframeHeader;
    @FindBy(id = "footer")
    private WarframeFooter warframeFooter;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("home_url"));
    }

    public boolean isHeaderPresent() {
        return warframeHeader.isUIObjectPresent(1);
    }

    public boolean isFooterPresent() {
        return warframeFooter.isUIObjectPresent(1);
    }

    @Override
    public AbstractPage pressHeaderButton(HeaderButton button) {
        return warframeHeader.pressButton(button);
    }

    public DigitalExtremesPage pressNewsButton() {
        return warframeFooter.pressNewsButton();
    }

    public TermsOfUsePage pressTermsOfUseButton() {
        return warframeFooter.pressTermsOfUseButton();
    }

    public PrivacyPolicyPage pressPrivacyPolicyButton() {
        return warframeFooter.pressPrivacyPolicyButton();
    }

    public EndUserLicenseAgreementPage pressEulaButton() {
        return warframeFooter.pressEulaButton();
    }
}
