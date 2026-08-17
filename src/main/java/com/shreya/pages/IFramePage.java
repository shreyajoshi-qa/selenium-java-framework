package com.shreya.pages;
import com.shreya.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage {
    private WebDriver driver;
    private By editorFrame = By.id("mce_0_ifr");
    private By editorText = By.id("tinymce");

    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToEditorFrame(){
        WaitUtils.waitForVisibility(driver, editorFrame);

        WebElement frame = driver.findElement(editorFrame);

        driver.switchTo().frame(frame);

    }
    public void enterText(String text) {
        WaitUtils.waitForVisibility(driver, editorText);

        WebElement editor = driver.findElement(editorText);

        editor.sendKeys(text);
    }

    public String getEditorText() {
        WaitUtils.waitForVisibility(driver, editorText);

        return driver.findElement(editorText).getText();
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

}
