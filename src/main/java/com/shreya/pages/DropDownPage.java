package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectOptionByValue(String value){
        WaitUtils.waitForVisibility(driver, dropdown);
        WebElement dropdownElement=driver.findElement(dropdown);
        Select select=new Select(dropdownElement);
        select.selectByValue(value);

    }
    public String getSelectedOption(){

        WaitUtils.waitForVisibility(driver, dropdown);
        WebElement dropdownElement=driver.findElement(dropdown);
        Select select=new Select(dropdownElement);
         return select.getFirstSelectedOption().getText();
    }
}
