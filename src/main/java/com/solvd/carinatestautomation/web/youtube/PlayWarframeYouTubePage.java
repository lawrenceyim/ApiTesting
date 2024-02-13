package com.solvd.carinatestautomation.web.youtube;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class PlayWarframeYouTubePage extends AbstractPage {
    public PlayWarframeYouTubePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("youtube_url") +
                Configuration.getRequired("play_warframe_url"));
    }
}
