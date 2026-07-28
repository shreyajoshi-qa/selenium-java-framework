package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {
    private WebDriver driver;

    private By firstImage = By.xpath("(//div[@class='figure'])[1]");
    private By userName = By.xpath("(//h5)[1]");

    public ActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOnFirstImage() {
        WaitUtils.waitForVisibility(driver, firstImage);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(firstImage)).perform();
    }

    public String getUserName() {
        return driver.findElement(userName).getText();
    }
}
