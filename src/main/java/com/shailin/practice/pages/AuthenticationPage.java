package com.shailin.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by chandrad on 3/28/17.
 */
public class AuthenticationPage extends BasePage {

  //  WebDriver driver ;
    WebDriverWait wait ;


    @FindBy(xpath = "//h3[text()='Already registered?']")
    private WebElement signInHeader ;

    @FindBy(id = "email_create")
    private WebElement createEmailTextField ;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccount ;

    @FindBy(id = "email")
    private WebElement emailTextField ;

    @FindBy(id = "passwd")
    private WebElement passwordTextField ;

    @FindBy(id = "SubmitLogin")
    private WebElement login ;

//    @FindBy(id = "dummy")
//    private WebElement dummy1 ;  // dummy will be initialized with a lazy proxy

    // if dumy does not exist , then on age load elementnotfound exception will be thrown
    //private WebElement dummy = driver.findElement(By.id("dummy")) ;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
       // this.driver = driver;
        PageFactory.initElements(driver,this);
        waitForPageLoad();
    }
//
//    public void waitForElement(WebElement element){
//
//        wait = new WebDriverWait(driver,15);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }

    public AuthenticationPage waitForPageLoad(){
        waitForElement(signInHeader);
        return this;
    }


    public void navToRegistration(String username){

        createEmailTextField.clear();
        createEmailTextField.sendKeys(username);
        createAccount.click();
    }

    public void signIn(String username, String password){

        emailTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        login.click();
    }
}
