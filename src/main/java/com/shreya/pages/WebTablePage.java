package com.shreya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePage {
    private WebDriver driver;
    private By tableRows = By.xpath("//table[@id='customers']//tr");

    public WebTablePage(WebDriver driver){
        this.driver = driver;
    }
    public String getAgeByName(String name){
        List<WebElement> rows=driver.findElements(tableRows);

       for (WebElement row : rows) {
            List<WebElement> columns=row.findElements(By.tagName("td"));
            String currentName = columns.get(0).getText();
            if (name.equals(currentName)) {
                return columns.get(1).getText();
            }
        }
        return null;
    }
}
