package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.FileUploadPage;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void uploadFileTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.uploadFile("C:\\Shreya Backup\\indexbkp.html");
        fileUploadPage.clickUploadButton();
    }
}
