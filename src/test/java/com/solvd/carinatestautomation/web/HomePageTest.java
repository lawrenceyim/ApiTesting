package com.solvd.carinatestautomation.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class HomePageTest {
    @Test
    public void verifyHeaderNavButtonTest() {
        WebDriver webDriver = getDriver();
        HomePage homePage = new HomePage(webDriver);
        homePage.pressHeaderNavButton();
    }
}
