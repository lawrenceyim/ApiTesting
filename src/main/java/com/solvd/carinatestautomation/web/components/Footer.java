package com.solvd.carinatestautomation.web.components;

import com.solvd.carinatestautomation.web.DigitalExtremesPage;
import com.solvd.carinatestautomation.web.EndUserLicenseAgreementPage;
import com.solvd.carinatestautomation.web.PrivacyPolicyPage;
import com.solvd.carinatestautomation.web.TermsOfUsePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Footer extends AbstractUIObject {
    @FindBy(xpath = "//div[@id='footer']//a[contains(@href, 'https://www.warframe.com/zendesk')]")
    private ExtendedWebElement supportButton;
    @FindBy(xpath = "//div[@id='footer']//a[contains(@href, 'https://www.digitalextremes.com')]")
    private ExtendedWebElement newsButton;
    @FindBy(xpath = "//div[@id='footer']//a[contains(@href, 'https://www.warframe.com/terms')]")
    private ExtendedWebElement termsOfUseButton;
    @FindBy(xpath = "//div[@id='footer']//a[contains(@href, 'https://www.warframe.com/privacy')]")
    private ExtendedWebElement privacyPolicyButton;
    @FindBy(xpath = "//div[@id='footer']//a[contains(@href, 'https://www.warframe.com/eula')]")
    private ExtendedWebElement eulaButton;
    @FindBy(xpath = "//div[@id='footer']//div[@id='ot-sdk-btn']")
    private ExtendedWebElement cookiesSettingsButton;

    public Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public DigitalExtremesPage pressNewsButton() {
        newsButton.click();
        return new DigitalExtremesPage(getDriver());
    }

    public TermsOfUsePage pressTermsOfUseButton() {
        termsOfUseButton.click();
        return new TermsOfUsePage(getDriver());
    }

    public PrivacyPolicyPage pressPrivacyPolicyButton() {
        privacyPolicyButton.click();
        return new PrivacyPolicyPage(getDriver());
    }

    public EndUserLicenseAgreementPage pressEulaButton() {
        eulaButton.click();
        return new EndUserLicenseAgreementPage(getDriver());
    }
}
