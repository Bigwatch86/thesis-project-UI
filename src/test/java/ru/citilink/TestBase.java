package ru.citilink;

import com.codeborne.selenide.Configuration;
import config.CredentialsConfig;
import helpers.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {
    public static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @BeforeAll
    static void setUp() {
        String browser = System.getProperty("browser");
        String version = System.getProperty("version");
        //String remoteUrl = System.getProperty("remoteUrl");
        String remoteUrl = config.remoteUrl();
        //String login = System.getProperty("login");
        String login = config.login();
        //String password = System.getProperty("password");
        String password = config.password();

        Configuration.browserSize = "1920x1080";
        Configuration.browser = browser;
        Configuration.browserVersion = version;
        Configuration.remote = "https://" + login + ":" + password + "@" + remoteUrl;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }
    @BeforeEach
    void baseURL(){
        open("https://www.citilink.ru/");
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
