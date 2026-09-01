package com.shreya.tests;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.annotations.*;

public class TestNGPractice {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][] {
                {"shreya", "pass123"},
                {"admin", "admin123"},
                {"testuser", "test123"}
        };
    }

    @DataProvider(name = "searchData")
    public Object[][] getsearchData() {

        return new Object[][] {
                {"selenium"},
                {"TestNG"},
                {"REST Assured"}
        };
    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {

        return new Object[][] {
                {"shreya", "pass123","admin"},
                {"John", "john123","user"},
                {"tester", "test123","tester"}
        };
    }

    @Test(dataProvider = "userData")
    public void userTest(String username, String password, String role) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
    }


    @Test(dataProvider = "searchData")
    public void searchTest(String searchText){
        System.out.println("Searching for " + searchText);
    }


    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    /*@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class!");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method!");
    }
    /*@Test(groups = "smoke")
    public void testOne(){
        System.out.println("Test one!");
    }
    @Test(groups={"smoke","regression"})
    public void testTwo(){
        System.out.println("Test Two!");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method!");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class!");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
*/

}
