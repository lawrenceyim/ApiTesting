package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.digitalextremes.DigitalExtremesPage;
import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.solvd.carinatestautomation.web.warframe.EndUserLicenseAgreementPage;
import com.solvd.carinatestautomation.web.warframe.HomePage;
import com.solvd.carinatestautomation.web.warframe.LandingPage;
import com.solvd.carinatestautomation.web.warframe.PrivacyPolicyPage;
import com.solvd.carinatestautomation.web.warframe.RotatingPage;
import com.solvd.carinatestautomation.web.warframe.TermsOfUsePage;
import com.solvd.carinatestautomation.web.youtube.PlayWarframeYouTubePage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends AbstractTest {
    /*
        ALL home page tests start from the landing page because the home URL redirects to the landing URL. This seems
        to occur because there are no saved caches to indicate that the website has already been visited previously
        when Selenium opens the website
    */
    @Test
    public void verifyLandingPageOpenTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        Assert.assertTrue(landingPage.isPageOpened(), "Landing page did not open.");
        Assert.assertTrue(landingPage.getContinueToHomeButton().isPresent(),
                "Landing page did not have a button to go to the home page.");
    }

    @Test
    public void verifyLandingToHomeButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(1), "The home page did not open.");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.isHeaderPresent(),
                "The home page did not have a header component.");
        softAssert.assertTrue(homePage.isFooterPresent(),
                "The home page did not have a footer component.");
        softAssert.assertAll();
    }

    // Rotating refers to the rotating events offered by Warframe
    @Test
    public void verifyRotatingButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        RotatingPage rotatingPage = homePage.pressRotatingButton();
        rotatingPage.open();
        Assert.assertTrue(rotatingPage.isPageOpened(1),
                "The rotating page did not open.");
    }

    // This test currently fails because:
    //      com.zebrunner.carina.utils.exception.InvalidConfigurationException:
    //      Getting the value of parameter 'url' as required failed: the value is missing.
    // This may be caused by YouTube page displaying a different URL until the page is fully loaded
    @Test
    public void verifyVideosButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        PlayWarframeYouTubePage playWarframeYouTubePage = homePage.pressVideosButton();
        playWarframeYouTubePage.open();
        Assert.assertTrue(playWarframeYouTubePage.isPageOpened(1),
                "The Play Warframe YouTube page did not open.");
    }

    @Test
    public void verifyNewsButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        DigitalExtremesPage digitalExtremesPage = homePage.pressNewsButton();
        digitalExtremesPage.open();
        Assert.assertTrue(digitalExtremesPage.isPageOpened(1),
                "The Digital Extremes company page did not open.");
    }

    @Test
    public void verifyTermsOfUseButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        TermsOfUsePage termsOfUsePage = homePage.pressTermsOfUseButton();
        termsOfUsePage.open();
        Assert.assertTrue(termsOfUsePage.isPageOpened(1),
                "The Terms of Use page did not open.");
    }

    @Test
    public void verifyPrivacyPolicyButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        PrivacyPolicyPage privacyPolicyPage = homePage.pressPrivacyPolicyButton();
        privacyPolicyPage.open();
        Assert.assertTrue(privacyPolicyPage.isPageOpened(1),
                "The Privacy Policy page did not open.");
    }

    @Test
    public void verifyEulaButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        EndUserLicenseAgreementPage endUserLicenseAgreementPage = homePage.pressEulaButton();
        endUserLicenseAgreementPage.open();
        Assert.assertTrue(endUserLicenseAgreementPage.isPageOpened(1),
                "The End User License Agreement page did not open.");
    }

    @Test
    public void verifyForumsButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        ForumsPage forumsPage = homePage.pressForumsButton();
        forumsPage.open();
        Assert.assertTrue(forumsPage.isPageOpened(1),
                "Forums page did not open");
    }
}
