package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends AbstractTest {
    /*
        ALL home page tests start from the landing page because the home URL redirects to the landing URL. This seems
        to occur because there are no saved caches to indicate that the website has already been visited previously
        when Selenium opens the website
    */
    @Test
    public void verifyLandingPageOpenTest() {
        openAndVerifyLandingPage();
    }

    @Test
    public void verifyLandingToHomeButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        openAndVerifyHomePage(landingPage);
    }

    // Rotating refers to the rotating events offered by Warframe
    @Test
    public void verifyRotatingButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyRotatingPage(homePage);
    }

    // This test currently fails because:
    //      com.zebrunner.carina.utils.exception.InvalidConfigurationException:
    //      Getting the value of parameter 'url' as required failed: the value is missing.
    // This may be caused by YouTube page displaying a different URL until the page is fully loaded
    @Test
    public void verifyVideosButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyPlayWarframeYouTubePage(homePage);
    }

    @Test
    public void verifyNewsButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyDigitalExtremesPage(homePage);
    }

    @Test
    public void verifyTermsOfUseButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyTermsOfUsePage(homePage);
    }

    @Test
    public void verifyPrivacyPolicyButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyPrivacyPolicyPage(homePage);
    }

    @Test
    public void verifyEulaButtonTest() {
        LandingPage landingPage = openAndVerifyLandingPage();
        HomePage homePage = openAndVerifyHomePage(landingPage);
        openAndVerifyEulaPage(homePage);
    }

    // HELPER FUNCTIONS
    private LandingPage openAndVerifyLandingPage() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        Assert.assertTrue(landingPage.isPageOpened());
        Assert.assertTrue(landingPage.getContinueToHomeButton().isPresent());
        return landingPage;
    }

    private HomePage openAndVerifyHomePage(LandingPage landingPage) {
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        Assert.assertTrue(homePage.getHeader().isUIObjectPresent(1));
        Assert.assertTrue(homePage.getFooter().isUIObjectPresent(1));
        return homePage;
    }

    private RotatingPage openAndVerifyRotatingPage(HomePage homePage) {
        RotatingPage rotatingPage = homePage.getHeader().pressRotatingButton();
        rotatingPage.open();
        Assert.assertTrue(rotatingPage.isPageOpened());
        return rotatingPage;
    }

    private PlayWarframeYouTubePage openAndVerifyPlayWarframeYouTubePage(HomePage homePage) {
        PlayWarframeYouTubePage playWarframeYouTubePage = homePage.getHeader().pressVideosButton();
        playWarframeYouTubePage.open();
        Assert.assertTrue(playWarframeYouTubePage.isPageOpened(5));
        return playWarframeYouTubePage;
    }

    private DigitalExtremesPage openAndVerifyDigitalExtremesPage(HomePage homePage) {
        DigitalExtremesPage digitalExtremesPage = homePage.getFooter().pressNewsButton();
        digitalExtremesPage.open();
        Assert.assertTrue(digitalExtremesPage.isPageOpened(1));
        return digitalExtremesPage;
    }

    private TermsOfUsePage openAndVerifyTermsOfUsePage(HomePage homePage) {
        TermsOfUsePage termsOfUsePage = homePage.getFooter().pressTermsOfUseButton();
        termsOfUsePage.open();
        Assert.assertTrue(termsOfUsePage.isPageOpened(1));
        return termsOfUsePage;
    }

    private PrivacyPolicyPage openAndVerifyPrivacyPolicyPage(HomePage homePage) {
        PrivacyPolicyPage privacyPolicyPage = homePage.getFooter().pressPrivacyPolicyButton();
        privacyPolicyPage.open();
        Assert.assertTrue(privacyPolicyPage.isPageOpened(1));
        return privacyPolicyPage;
    }

    private EndUserLicenseAgreementPage openAndVerifyEulaPage(HomePage homePage) {
        EndUserLicenseAgreementPage endUserLicenseAgreementPage = homePage.getFooter().pressEulaButton();
        endUserLicenseAgreementPage.open();
        Assert.assertTrue(endUserLicenseAgreementPage.isPageOpened(1));
        return endUserLicenseAgreementPage;
    }
}
