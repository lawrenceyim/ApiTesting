package com.solvd.carinatestautomation.web.store;

import com.solvd.carinatestautomation.web.store.components.Product;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends AbstractPage {
    @FindBy(xpath = "//div[contains(@class, 'grid')]//div[@class='grid-product__content']")
    List<Product> searchItems;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<Product> getSearchItems() {
        return searchItems;
    }
}
