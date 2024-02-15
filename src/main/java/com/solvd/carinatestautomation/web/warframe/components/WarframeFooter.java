package com.solvd.carinatestautomation.web.warframe.components;

import com.solvd.carinatestautomation.web.digitalextremes.DigitalExtremesPage;
import com.solvd.carinatestautomation.web.warframe.EndUserLicenseAgreementPage;
import com.solvd.carinatestautomation.web.warframe.PrivacyPolicyPage;
import com.solvd.carinatestautomation.web.warframe.TermsOfUsePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WarframeFooter extends AbstractUIObject {
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com/zendesk')]")
    private ExtendedWebElement supportButton;
    @FindBy(xpath = ".//a[contains(@href, 'https://www.digitalextremes.com')]")
    private ExtendedWebElement newsButton;
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com/terms')]")
    private ExtendedWebElement termsOfUseButton;
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com/privacy')]")
    private ExtendedWebElement privacyPolicyButton;
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com/eula')]")
    private ExtendedWebElement eulaButton;
    @FindBy(xpath = ".//div[@id='ot-sdk-btn']")
    private ExtendedWebElement cookiesSettingsButton;

    public WarframeFooter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean verifySupportButtonIsPresent() {
        return supportButton.isPresent(1);
    }

    public boolean verifyNewsButtonIsPresent() {
        return newsButton.isPresent(1);
    }

    public boolean verifyTermsOfUseButtonIsPresent() {
        return termsOfUseButton.isPresent(1);
    }

    public boolean verifyPrivacyPolicyButtonIsPresent() {
        return privacyPolicyButton.isPresent(1);
    }

    public boolean verifyEulaButtonIsPresent() {
        return eulaButton.isPresent(1);
    }

    public boolean verifyCookiesSettingButtonIsPresent() {
        return cookiesSettingsButton.isPresent(1);
    }

    public DigitalExtremesPage pressNewsButton() {
        newsButton.scrollTo();
        newsButton.clickIfPresent(1);
        return new DigitalExtremesPage(getDriver());
    }

    public TermsOfUsePage pressTermsOfUseButton() {
        termsOfUseButton.scrollTo();
        termsOfUseButton.clickIfPresent(1);
        return new TermsOfUsePage(getDriver());
    }

    public PrivacyPolicyPage pressPrivacyPolicyButton() {
        privacyPolicyButton.scrollTo();
        privacyPolicyButton.clickIfPresent(1);
        return new PrivacyPolicyPage(getDriver());
    }

    public EndUserLicenseAgreementPage pressEulaButton() {
        eulaButton.scrollTo();
        eulaButton.clickIfPresent(1);
        return new EndUserLicenseAgreementPage(getDriver());
    }
}
