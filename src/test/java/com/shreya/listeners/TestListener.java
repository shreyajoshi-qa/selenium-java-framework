package com.shreya.listeners;

import com.shreya.base.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object testClass = result.getInstance();

        BaseTest baseTest = (BaseTest) testClass;

        WebDriver driver = baseTest.getDriver();

        TakesScreenshot takesScreenshot =
                (TakesScreenshot) driver;

        File screenshotFile =
                takesScreenshot.getScreenshotAs(OutputType.FILE);

        Path screenshotDirectory = Paths.get("screenshots");

        try {
            Files.createDirectories(screenshotDirectory);

            Path destination =
                    screenshotDirectory.resolve("failed_test.png");

            Files.copy(
                    screenshotFile.toPath(),
                    destination
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}