package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForumsPageTest extends AbstractTest {
    @Test
    public void verifyForumsSearchTest() {
        ForumsPage forumsPage = new ForumsPage(getDriver());
        forumsPage.open();
        Assert.assertTrue(forumsPage.isPageOpened(1));
        forumsPage.searchForums("Riven");
        Assert.assertEquals(forumsPage.getCurrentUrl(), "https://forums.warframe.com/search/?q=riven&quick=1");
    }
}
