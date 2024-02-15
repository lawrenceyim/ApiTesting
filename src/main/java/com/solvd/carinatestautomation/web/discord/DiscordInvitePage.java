package com.solvd.carinatestautomation.web.discord;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class DiscordInvitePage extends AbstractPage {
    public DiscordInvitePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(Configuration.getRequired("discord_invite_url"));
    }
}
