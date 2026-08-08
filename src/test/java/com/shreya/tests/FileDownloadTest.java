package com.shreya.tests;

import com.shreya.base.BaseTest;
import com.shreya.pages.FileDownloadPage;
import com.shreya.utils.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadTest extends BaseTest {
    @Test
    public void downloadFileTest() {

        FileDownloadPage page = new FileDownloadPage(driver);

        String downloadPath =
                System.getProperty("user.dir") + "\\downloads";
        File downloadDir = new File(downloadPath);
        File[] filesBefore = downloadDir.listFiles();


        page.downloadFile();

        File downloadedFile =
                WaitUtils.waitForFileDownload(driver, downloadPath,filesBefore);

        Assert.assertTrue(
                downloadedFile.exists(),
                "Downloaded file was not found"
        );
    }
}
