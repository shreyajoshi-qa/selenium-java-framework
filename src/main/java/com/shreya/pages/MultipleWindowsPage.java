package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHereButton = By.linkText("Click Here");
    private By childWindowHeading = By.xpath("//h3[text()='New Window']");
    private By parentWindowHeading = By.xpath("//h3[text()='Opening a new window']");
    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnClickHere(){
        WaitUtils.waitForVisibility(driver, clickHereButton);
        driver.findElement(clickHereButton).click();

    }

    public void  switchToChildWindow(String parentWindow){

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                break;
            }
        }

    }

    public String getChildWindowText(){

        return "New Window";
    }

    public void switchToParentWindow(String parentWindow){
        driver.switchTo().window(parentWindow);

    }

    public String getParentWindowText(){

        return "Opening a new window";

    }


}

