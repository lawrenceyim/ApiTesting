package com.solvd.carinatestautomation.web;

import com.solvd.carinatestautomation.web.store.SearchResultPage;
import com.solvd.carinatestautomation.web.store.StorePage;
import com.solvd.carinatestautomation.web.store.components.Product;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StorePageTest extends AbstractTest {
    @Test
    public void verifyStorePageOpensTest() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        Assert.assertTrue(storePage.isPageOpened(1), "The store page did not open.");
        Assert.assertTrue(storePage.isHeaderPresent(), "The header is missing in the store page.");
    }

    @Test
    public void verifySearchWorksTest() {
        final int productsListed = 2;
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        SearchResultPage searchResultPage = storePage.searchStore("hoodie");
        Assert.assertEquals(searchResultPage.getCurrentUrl(1),
                "https://store.warframe.com/search?type=product%2Carticle%2Cpage&q=hoodie*",
                "Store URL do not match");
        List<Product> products = searchResultPage.getSearchItems();
        Assert.assertEquals(products.size(), productsListed);
    }
}
