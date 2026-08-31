package com.shreya.pages;
import com.shreya.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.shreya.utils.WaitUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    private By searchBox = By.name("q");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        logger.info("Waiting for search box");
        type(searchBox, text);
        logger.info("Entering search text: {}", text);
        pressEnter(searchBox);
        logger.info("Search submitted");

    }
}
