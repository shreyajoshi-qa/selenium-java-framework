package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotspot= By.id("hot-spot");
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;

    }
    public void contextClick()  {
        WaitUtils.waitForVisibility(driver, hotspot);
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotspot)).perform();
    }

}
