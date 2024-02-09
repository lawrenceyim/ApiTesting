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
        verifyAndOpenLandingPage();
    }

    @Test
    public void verifyLandingToHomeButtonTest() {
        LandingPage landingPage = verifyAndOpenLandingPage();
        verifyAndOpenHomePage(landingPage);
    }

    @Test
    public void verifyRotatingLinkButtonTest() {
        LandingPage landingPage = verifyAndOpenLandingPage();
        HomePage homePage = verifyAndOpenHomePage(landingPage);
        verifyAndOpenRotatingPage(homePage);
    }

    // HELPER FUNCTIONS
    private LandingPage verifyAndOpenLandingPage() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        Assert.assertTrue(landingPage.isPageOpened());
        Assert.assertTrue(landingPage.getContinueToHomeButton().isPresent());
        return landingPage;
    }

    private HomePage verifyAndOpenHomePage(LandingPage landingPage) {
        HomePage homePage = landingPage.pressGoToHomeButton();
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened());
        Assert.assertTrue(homePage.getHeaderComponent().isUIObjectPresent(1));
        return homePage;
    }

    private RotatingPage verifyAndOpenRotatingPage(HomePage homePage) {
        RotatingPage rotatingPage = homePage.getHeaderComponent().pressRotatingLinkButton();
        rotatingPage.open();
        Assert.assertTrue(rotatingPage.isPageOpened());
        return rotatingPage;
    }
}
