package com.solvd.carinatestautomation.web;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class PlayWarframeYouTubePage extends AbstractPage {
    public PlayWarframeYouTubePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("youtube.com/user/playwarframe");
    }
}
