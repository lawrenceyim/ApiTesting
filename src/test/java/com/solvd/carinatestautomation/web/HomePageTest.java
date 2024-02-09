package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.core.AbstractTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends AbstractTest {
    @Test
    public void verifyLandingPageOpenTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
    }
    @Test
    public void verifyGoToHomeTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        landingPage.pressGoToHomeButton();
    }

    @Test
    public void verifyRotatingLinkButtonTest() {
        LandingPage landingPage = new LandingPage(getDriver());
        landingPage.open();
        landingPage.pressGoToHomeButton();

    }
}
