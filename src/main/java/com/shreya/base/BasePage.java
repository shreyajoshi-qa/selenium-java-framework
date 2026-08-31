package com.shreya.base;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        WaitUtils.waitForClickability(driver,locator);
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        WaitUtils.waitForVisibility(driver, locator);
        driver.findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        WaitUtils.waitForVisibility(driver,locator);
        String text = driver.findElement(locator).getText();
        return text;
    }

    protected boolean isDisplayed(By locator) {

        return driver.findElement(locator).isDisplayed();
    }

    protected String getAttribute(By locator, String attribute) {

       return driver.findElement(locator).getAttribute(attribute);

    }

    protected void pressEnter(By locator) {
        WaitUtils.waitForVisibility(driver, locator);
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    }