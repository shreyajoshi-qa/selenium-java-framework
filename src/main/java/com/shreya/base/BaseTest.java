package com.shreya.base;

import com.shreya.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import com.shreya.driver.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseTest {
    private static final Logger logger = LogManager.getLogger(BaseTest.class);
    protected WebDriver driver;
    @BeforeMethod
    public void setup() {
        logger.info("Initializing browser");
        DriverFactory.initializeDriver();
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("url"));
        logger.info("Browser launched successfully");

    }
    @AfterMethod
    public void tearDown() {
        logger.info("Closing browser");
        if (driver != null) {
            driver.quit();
        }

    }
}
