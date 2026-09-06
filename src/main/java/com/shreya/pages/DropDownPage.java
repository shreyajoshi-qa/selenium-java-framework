package com.shreya.pages;

import com.shreya.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
