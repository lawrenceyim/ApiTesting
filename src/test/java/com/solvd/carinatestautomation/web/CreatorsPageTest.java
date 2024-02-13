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
        Assert.assertTrue(creatorsPage.isPageOpened(1));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(creatorsPage.isHeaderPresent());
        softAssert.assertTrue(creatorsPage.isCreatorsButtonPresent());
        softAssert.assertTrue(creatorsPage.isProgramOverviewButtonPresent());
        softAssert.assertAll();
    }
}
