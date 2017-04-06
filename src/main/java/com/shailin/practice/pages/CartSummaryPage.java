package com.shailin.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chandrad on 3/28/17.
 */
public class CartSummaryPage extends BasePage{

  //  WebDriver driver ;
    WebDriverWait wait ;


    @FindBy(id = "cart_summary")
    private WebElement cartSummary ;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    private WebElement checkoutStep2 ;

    public CartSummaryPage(WebDriver driver) {
        super(driver);
      //  this.driver = driver;
        PageFactory.initElements(driver,this);
        waitForPageLoad();
    }

//    public void waitForElement(WebElement element){
//
//        wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

    public CartSummaryPage waitForPageLoad(){
        waitForElement(cartSummary);
        return this;
    }


    public AuthenticationPage navigateToAuth(){
        checkoutStep2.click();

        return new AuthenticationPage(driver);
    }
}
