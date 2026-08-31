package com.shreya.pages;

import com.shreya.base.BasePage;
import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
            }
    public void selectOptionByValue(String value){
        selectByValue(dropdown,value);

    }
    public String getSelectedOption(){
        return  getSelectedOption(dropdown);
    }
}
