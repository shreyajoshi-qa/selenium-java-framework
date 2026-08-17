package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ScreenshotTest extends BaseTest {

    @Test
    public void screenshotTest() {

        Assert.assertTrue(
                false,
                "Intentional failure for screenshot test"
        );
    }
}