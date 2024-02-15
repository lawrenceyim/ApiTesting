package com.solvd.carinatestautomation.web.warframe.components;

import com.solvd.carinatestautomation.web.forums.ForumsPage;
import com.solvd.carinatestautomation.web.warframe.CrossProgressionPage;
import com.solvd.carinatestautomation.web.warframe.DiscordInvitePage;
import com.solvd.carinatestautomation.web.warframe.DownloadPage;
import com.solvd.carinatestautomation.web.warframe.HomePage;
import com.solvd.carinatestautomation.web.warframe.InitiatePackPage;
import com.solvd.carinatestautomation.web.warframe.LoginPage;
import com.solvd.carinatestautomation.web.warframe.MarketBundlesPage;
import com.solvd.carinatestautomation.web.warframe.MobileAppPage;
import com.solvd.carinatestautomation.web.warframe.NewPlayerGuidePage;
import com.solvd.carinatestautomation.web.warframe.RotatingPage;
import com.solvd.carinatestautomation.web.warframe.SearchPage;
import com.solvd.carinatestautomation.web.warframe.UpdatesPage;
import com.solvd.carinatestautomation.web.youtube.PlayWarframeYouTubePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class WarframeHeader extends AbstractUIObject {
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//div[@id='drpNavCommunity']")
    private ExtendedWebElement communityDropdownLabel;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//div[@id='drpNavGame']")
    private ExtendedWebElement gameDropdownLabel;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//div[@id='drpNavGuides']")
    private ExtendedWebElement guidesDropdownLabel;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//div[@id='drpNavStore']")
    private ExtendedWebElement storeDropdownLabel;

    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/crossprogression')]")
    private ExtendedWebElement crossPlatformPlayGuideButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/download')]")
    private ExtendedWebElement downloadButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://forums.warframe.com')]")
    private ExtendedWebElement forumsButton;
    @FindBy(xpath = ".//a[contains(@href, 'https://www.warframe.com')]")
    private ExtendedWebElement homeButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/initiate-pack')]")
    private ExtendedWebElement initiatePowerPackButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/search')]")
    private ExtendedWebElement latestNewsButton;
    @FindBy(xpath = ".//a[@id='btnLogin']")
    private ExtendedWebElement loginButton;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/market-bundles')]")
    private ExtendedWebElement marketBundlesButton;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/mobile-app')]")
    private ExtendedWebElement mobileCompanionAppButton;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/news/new-player-guide')]")
    private ExtendedWebElement newPlayerGuideButton;
    @FindBy(xpath = "//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://discord.com/invite/playwarframe')]")
    private ExtendedWebElement officialDiscordServerButton;
    @FindBy(xpath = ".//div[@class='HeaderMenuItem is-highlighted']")
    private ExtendedWebElement rotatingButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.warframe.com/updates')]")
    private ExtendedWebElement updatesButton;
    @FindBy(xpath = ".//div[@class='HeaderDesktopMenu']//a[contains(@href, 'https://www.youtube.com/user/playwarframe')]")
    private ExtendedWebElement videosButton;

    public WarframeHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public AbstractPage pressButton(HeaderButton button) {
        switch (button) {
            case CrossPlatformPlayGuideButton:
                return pressCrossPlatformPlayGuideButton();
            case DownloadGameButton:
                return pressDownloadGameButton();
            case ForumsButton:
                return pressForumsButton();
            case GameUpdatesButton:
                return pressGameUpdatesButton();
            case HomeButton:
                return pressHomeButton();
            case InitiatePowerPackButton:
                return pressInitiatePowerPackButton();
            case LatestNewsButton:
                return pressLatestNewsButton();
            case LoginButton:
                return pressLoginButton();
            case MarketBundleButton:
                return pressMarketBundleButton();
            case MobileCompanionAppButton:
                return pressMobileCompanionAppButton();
            case NewPlayerGuideButton:
                return pressNewPlayerGuideButton();
            case OfficialDiscordServerButton:
                return pressOfficialDiscordServerButton();
            case OfficialMerchButton:
                return null;
            case PlatinumAndBundlesButton:
                return null;
            case PlayFreeNowButton:
                return null;
            case PrimeAccessButton:
                return null;
            case PrimeResurgenceButton:
                return null;
            case QuestGuideButton:
                return null;
            case QuickStartGuideButton:
                return null;
            case RedeemCodeButton:
                return null;
            case ReferralProgramButton:
                return null;
            case ReturningPlayerGuideButton:
                return null;
            case RotatingPageButton:
                return pressRotatingButton();
            case StoryRecapButton:
                return null;
            case SupportButton:
                return null;
            case SupporterPacksButton:
                return null;
            case TwitchChannelButton:
                return null;
            case TwitterButton:
                return null;
            case VideosButton:
                return pressVideosButton();
            case WarframeCreatorsButton:
                return null;
            case WarframeVolunteersButton:
                return null;
            case WarframeWikiButton:
                return null;
            case WarframesButton:
                return null;
            default:
                return null;
        }
    }

    private DownloadPage pressDownloadGameButton() {
        gameDropdownLabel.scrollTo();
        gameDropdownLabel.hover();
        downloadButton.clickIfPresent(1);
        return new DownloadPage(getDriver());
    }

    private CrossProgressionPage pressCrossPlatformPlayGuideButton() {
        guidesDropdownLabel.scrollTo();
        guidesDropdownLabel.hover();
        crossPlatformPlayGuideButton.clickIfPresent(1);
        return new CrossProgressionPage(getDriver());
    }

    private ForumsPage pressForumsButton() {
        communityDropdownLabel.scrollTo();
        communityDropdownLabel.hover();
        forumsButton.clickIfPresent(1);
        return new ForumsPage(getDriver());
    }

    private UpdatesPage pressGameUpdatesButton() {
        gameDropdownLabel.scrollTo();
        gameDropdownLabel.hover();
        updatesButton.clickIfPresent(1);
        return new UpdatesPage(getDriver());
    }

    private HomePage pressHomeButton() {
        homeButton.scrollTo();
        homeButton.clickIfPresent(1);
        return new HomePage(getDriver());
    }

    private InitiatePackPage pressInitiatePowerPackButton() {
        storeDropdownLabel.scrollTo();
        storeDropdownLabel.hover();
        initiatePowerPackButton.clickIfPresent(1);
        return new InitiatePackPage(getDriver());
    }

    private SearchPage pressLatestNewsButton() {
        gameDropdownLabel.scrollTo();
        gameDropdownLabel.hover();
        latestNewsButton.clickIfPresent(1);
        return new SearchPage(getDriver());
    }

    private LoginPage pressLoginButton() {
        loginButton.scrollTo();
        loginButton.clickIfPresent(1);
        return new LoginPage(getDriver());
    }

    private MarketBundlesPage pressMarketBundleButton() {
        storeDropdownLabel.scrollTo();
        storeDropdownLabel.hover();
        marketBundlesButton.clickIfPresent(1);
        return new MarketBundlesPage(getDriver());
    }

    private MobileAppPage pressMobileCompanionAppButton() {
        gameDropdownLabel.scrollTo();
        gameDropdownLabel.hover();
        mobileCompanionAppButton.clickIfPresent(1);
        return new MobileAppPage(getDriver());
    }

    private NewPlayerGuidePage pressNewPlayerGuideButton() {
        guidesDropdownLabel.scrollTo();
        guidesDropdownLabel.hover();
        newPlayerGuideButton.clickIfPresent(1);
        return new NewPlayerGuidePage(getDriver());
    }

    private DiscordInvitePage pressOfficialDiscordServerButton() {
        communityDropdownLabel.scrollTo();
        communityDropdownLabel.hover();
        officialDiscordServerButton.clickIfPresent(1);
        return new DiscordInvitePage(getDriver());
    }

    private RotatingPage pressRotatingButton() {
        rotatingButton.scrollTo();
        rotatingButton.clickIfPresent(1);
        return new RotatingPage(getDriver());
    }

    private PlayWarframeYouTubePage pressVideosButton() {
        videosButton.scrollTo();
        videosButton.clickIfPresent(1);
        return new PlayWarframeYouTubePage(getDriver());
    }
}
