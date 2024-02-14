package com.solvd.carinatestautomation.web.store.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {
    @FindBy(xpath = ".//a[contains(@class, 'grid-product__link ')]")
    private ExtendedWebElement hrefElement;
    @FindBy(xpath = ".//div[contains(@class, 'grid-product__title')]")
    private ExtendedWebElement productTitle;
    @FindBy(xpath = ".//div[contains(@class, 'grid-product__price')]/span")
    private ExtendedWebElement productPrice;

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getProductUrl() {
        return hrefElement.getText();
    }

    public String getProductTitle() {
        return productTitle.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }
}
