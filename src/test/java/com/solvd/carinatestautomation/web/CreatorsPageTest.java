package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.warframe.CreatorsListPage;
import com.solvd.carinatestautomation.web.warframe.CreatorsPage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreatorsPageTest extends AbstractTest {
    @Test
    public void verifyCreatorsPageOpens() {
        CreatorsPage creatorsPage = new CreatorsPage(getDriver());
        creatorsPage.open();
        Assert.assertTrue(creatorsPage.isPageOpened(1), "Creators page didn't open.");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(creatorsPage.isHeaderPresent(), "Header is missing.");
        softAssert.assertTrue(creatorsPage.isCreatorsButtonPresent(), "Creators button is missing.");
        softAssert.assertTrue(creatorsPage.isProgramOverviewButtonPresent(), "Creators list button is missing.");
        softAssert.assertAll();
    }

    @Test
    public void verifyCreatorsButtonTest() {
        CreatorsPage creatorsPage = new CreatorsPage(getDriver());
        creatorsPage.open();
        CreatorsListPage creatorsListPage = creatorsPage.pressCreatorsButton();
        creatorsListPage.open();
        Assert.assertTrue(creatorsListPage.isPageOpened(1), "Creators list page didn't open.");
        Assert.assertEquals(creatorsListPage.getCurrentUrl(),
                "https://www.warframe.com/community/creators/list",
                "Creators list page URL does not match.");
    }

    @Test
    public void verifyProgramViewButtonTest() {
        CreatorsPage creatorsPage = new CreatorsPage(getDriver());
        creatorsPage.open();
        creatorsPage.pressProgramOverviewButton();
        Assert.assertEquals(creatorsPage.getCurrentUrl(),
                "https://www.warframe.com/community/creators",
                "Creators page URL does not match.");
    }
}
