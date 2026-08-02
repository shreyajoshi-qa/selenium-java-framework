package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {
    private WebDriver driver;
    private By doubleClickButton=By.xpath("//button[text()='Double-Click Me To See Alert']");
    public DoubleClickPage(WebDriver driver) {
        this.driver = driver;
    }
    public void doubleClickOnButton(){
        WaitUtils.waitForVisibility(driver, doubleClickButton);
        Actions actions = new Actions(driver);
        WebElement button=driver.findElement(doubleClickButton);
        actions.doubleClick(button).perform();

    }
}
