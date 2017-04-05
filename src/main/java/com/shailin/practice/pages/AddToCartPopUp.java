package com.shailin.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chandrad on 3/28/17.
 */
public class AddToCartPopUp {

    WebDriver driver ;
    WebDriverWait wait ;

    public AddToCartPopUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "icon-ok")
    private WebElement cartSuccessMessage ;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement checkoutStep1Button ;

    @FindBy(id = "layer_cart_product_title")
    private static WebElement addedprocutName ;


    public void waitForElement(WebElement element){

        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageLoad(){
        waitForElement(cartSuccessMessage);
    }

}
