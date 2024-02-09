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
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[1]")
    private ExtendedWebElement supportButton;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[2]")
    private ExtendedWebElement newsButton;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[3]")
    private ExtendedWebElement termsOfUseButton;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[4]")
    private ExtendedWebElement privacyPolicyButton;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[5]")
    private ExtendedWebElement eulaButton;
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div/a[6]")
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
