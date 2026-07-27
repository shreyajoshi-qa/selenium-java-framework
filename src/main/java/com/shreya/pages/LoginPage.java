package com.shreya.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.shreya.utils.WaitUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    private WebDriver driver;

    private By searchBox = By.name("q");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String text) {
        logger.info("Waiting for search box");
        WaitUtils.waitForVisibility(driver, searchBox);

        logger.info("Entering search text: {}", text);
        driver.findElement(searchBox).sendKeys(text, Keys.ENTER);

        logger.info("Search submitted");

    }
}
