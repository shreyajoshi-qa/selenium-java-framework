package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.JavaScriptExecutorPage;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends BaseTest {
    @Test
    public void verifyJavaScriptExecutor() {

        JavaScriptExecutorPage javaScriptExecutorPage =
                new JavaScriptExecutorPage(driver);

       // javaScriptExecutorPage.scrollToLoginButton();

        javaScriptExecutorPage.clickUsingJS();
    }
}
