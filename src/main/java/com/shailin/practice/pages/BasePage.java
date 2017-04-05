package com.shailin.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chandrad on 4/5/17.
 */
public class BasePage {

    long PAGE_LOAD_TIMEOUT = 20 ;
    WebDriver driver ;
    WebDriverWait wait ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void waitForElement(WebElement element){
        wait = new WebDriverWait(driver,PAGE_LOAD_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
