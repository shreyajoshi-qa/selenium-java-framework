package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    private WebDriver driver;
    private By source = By.id("column-a");
    private By destination = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }
    public void dragSourceToDestination(){
        WaitUtils.waitForVisibility(driver, source);
        WaitUtils.waitForVisibility(driver, destination);
        WebElement sourceElement = driver.findElement(source);
        WebElement destinationElement = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement,destinationElement).perform();
    }

}
