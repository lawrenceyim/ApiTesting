package com.solvd.carinatestautomation.web.store;

import com.solvd.carinatestautomation.web.store.components.Product;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends AbstractPage {
    @FindAll(
            @FindBy(xpath = "//div[@class='grid grid--uniform']/div[@class='grid__item grid-product medium-up--one-quarter small--one-half grid-product__has-quick-shop aos-init aos-animate']")
    )
    List<Product> searchItems;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
}
