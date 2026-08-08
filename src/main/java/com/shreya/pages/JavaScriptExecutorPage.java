package com.shreya.pages;

import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPage {
    private WebDriver driver;
    private By loginButton = By.id("loginBtn");
    private By click=By.linkText("Back to homepage");

    public JavaScriptExecutorPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollToLoginButton(){
        WaitUtils.waitForVisibility(driver,loginButton );
        WebElement loginButtonElement=driver.findElement(loginButton);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                loginButtonElement
        );
    }
    public void clickUsingJS(){
        WaitUtils.waitForVisibility(driver,click );
        WebElement loginButtonElement=driver.findElement(click);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginButtonElement);

    }
}
