package com.walmart.hooks;

import com.walmart.sites.WalmartSite;
import com.walmart.utils.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;
    public WalmartSite walmartSite;
    public ChromeOptions options;

    public WalmartSite getWalmartSite()
    {
        return walmartSite;
    }

    @Before
    public void setUp()
    {
        options = new ChromeOptions();
        options.addArguments("user-data-dir=C:/Users/ksfl580/AppData/Local/Google/Chrome/User Data//Default/");
        options.addArguments("--start-maximized");
        //options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--enable-javascript");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Properties.LONG_WAIT, TimeUnit.SECONDS);
        walmartSite = new WalmartSite(driver);
    }

    @After
    public void tearDown()
    {
        //driver.quit();
    }
}