package com.shreya.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.shreya.config.ConfigReader;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    private static WebDriver driver;
    public static void initializeDriver() {
        String browser = ConfigReader.getProperty("browser");
        logger.info("Selected browser: {}", browser);

        if (browser.equalsIgnoreCase("chrome")) {
            logger.info("Launching Chrome browser");

            ChromeOptions options = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();

            String downloadPath =
                    System.getProperty("user.dir") + "\\downloads";

            prefs.put("download.default_directory", downloadPath);

            options.setExperimentalOption("prefs", prefs);

            driver = new ChromeDriver(options);
        }
        else if (browser.equalsIgnoreCase("edge")) {
            logger.info("Launching Edge browser");
            driver = new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            logger.info("Launching Firefox browser");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

    }
    public static WebDriver getDriver() {
        return driver;
    }


}
