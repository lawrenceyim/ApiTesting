package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.warframe.CreatorsListPage;
import com.solvd.carinatestautomation.web.warframe.CreatorsPage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreatorsListPageTest extends AbstractTest {
    @Test
    public void verifyCreatorsListPageOpens() {
        CreatorsListPage creatorsListPage = new CreatorsListPage(getDriver());
        creatorsListPage.open();
        Assert.assertTrue(creatorsListPage.isPageOpened(1));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(creatorsListPage.isHeaderPresent());
        softAssert.assertTrue(creatorsListPage.isCreatorsButtonPresent());
        softAssert.assertTrue(creatorsListPage.isProgramOverviewButtonPresent());
        softAssert.assertAll();
    }

    @Test
    public void verifyCreatorsButtonTest() {
        CreatorsListPage creatorsListPage = new CreatorsListPage(getDriver());
        creatorsListPage.open();
        creatorsListPage.pressCreatorsButton();
        Assert.assertEquals(creatorsListPage.getCurrentUrl(), "https://www.warframe.com/community/creators/list");
    }

    @Test
    public void verifyProgramViewButtonTest() {
        CreatorsListPage creatorsListPage = new CreatorsListPage(getDriver());
        creatorsListPage.open();
        CreatorsPage creatorsPage = creatorsListPage.pressProgramOverviewButton();
        creatorsPage.open();
        Assert.assertTrue(creatorsPage.isPageOpened(1));
        Assert.assertEquals(creatorsPage.getCurrentUrl(), "https://www.warframe.com/community/creators");
    }
}
