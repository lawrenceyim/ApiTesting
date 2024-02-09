package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.core.AbstractTest;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

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

    // Rotating refers to the rotating events offered by Warframe
    @Test
    public void verifyRotatingButtonTest() {
        LandingPage landingPage = verifyAndOpenLandingPage();
        HomePage homePage = verifyAndOpenHomePage(landingPage);
        verifyAndOpenRotatingPage(homePage);
    }

    // This test currently fails because:
    //      com.zebrunner.carina.utils.exception.InvalidConfigurationException:
    //      Getting the value of parameter 'url' as required failed: the value is missing.
    // This may be caused by YouTube page displaying a different URL until the page is fully loaded
    @Test
    public void verifyVideosButtonTest() {
        LandingPage landingPage = verifyAndOpenLandingPage();
        HomePage homePage = verifyAndOpenHomePage(landingPage);
        verifyAndOpenPlayWarframeYouTubePage(homePage);
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
        RotatingPage rotatingPage = homePage.getHeaderComponent().pressRotatingButton();
        rotatingPage.open();
        Assert.assertTrue(rotatingPage.isPageOpened());
        return rotatingPage;
    }

    private PlayWarframeYouTubePage verifyAndOpenPlayWarframeYouTubePage(HomePage homePage) {
        PlayWarframeYouTubePage playWarframeYouTubePage = homePage.getHeaderComponent().pressVideosButton();
        playWarframeYouTubePage.open();
        Assert.assertTrue(playWarframeYouTubePage.isPageOpened(5));
        return playWarframeYouTubePage;
    }
}
