package com.shreya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTablePage {

    private WebDriver driver;

    private By tableRows = By.xpath("//table[1]//tbody/tr");

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDueAmountByLastName(String lastName) {

        List<WebElement> rows = driver.findElements(tableRows);

        for (WebElement row : rows) {

            List<WebElement> columns = row.findElements(By.tagName("td"));

            String currentLastName = columns.get(0).getText();

            if (lastName.equals(currentLastName)) {
                return columns.get(3).getText();
            }


        }

        return null;
    }
    public void clickEditByLastName(String lastName){
        List <WebElement> rows=driver.findElements(tableRows);
        for(WebElement row :rows){
            List <WebElement> columns=driver.findElements(By.tagName("td"));

            if(!columns.isEmpty()){
                 String currentLastName=columns.get(0).getText();
                 if (lastName.equals(currentLastName)){
                     row.findElement(By.linkText("edit")).click();
                     return;

                 }

            }


        }

    }
    public List<String> getRowDataByLastName(String lastName) {

        List<WebElement> rows = driver.findElements(tableRows);

        for (WebElement row : rows) {

            List<WebElement> columns = row.findElements(By.tagName("td"));

            if (!columns.isEmpty()
                    && lastName.equals(columns.get(0).getText())) {

                List<String> rowData = new ArrayList<>();

                for (WebElement column : columns) {
                    rowData.add(column.getText());
                }

                return rowData;
            }
        }

        return null;
    }
    public String getCellValue(String rowValue, int columnIndex) {

        List<WebElement> rows = driver.findElements(tableRows);

        for (WebElement row : rows) {

            List<WebElement> columns = row.findElements(By.tagName("td"));

            if (!columns.isEmpty()
                    && rowValue.equals(columns.get(0).getText())) {

                return columns.get(columnIndex).getText();
            }
        }

        return null;
    }


    public List<String> getAllLastNames(){

        List <String> lastnames=new ArrayList<>();
        List<WebElement> rows=driver.findElements(tableRows);
        for(WebElement row : rows){
            List <WebElement> columns=row.findElements(By.tagName("td"));
            String lastName=columns.get(0).getText();
            lastnames.add(lastName);


        }
        return lastnames;


    }

    public int getCountByDueAmount(String amount) {
        int count=0;
        List<WebElement> rows = driver.findElements(tableRows);
        for (WebElement row : rows) {
            List <WebElement> columns=row.findElements(By.tagName("td"));
            String dueAmount = columns.get(3).getText();
            if (dueAmount.equals(amount)) {
                count++;

            }
        }
        return count;
    }

}