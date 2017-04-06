package com.shailin.practice.tests;

import com.shailin.practice.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by chandrad on 3/29/17.
 */
public class MyFirstTest {

    WebDriver driver ;
    String baseURL = "http://automationpractice.com/index.php" ;

    @BeforeMethod
    public void setUp(){

        System.out.println("setting up");

        driver = new ChromeDriver();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int Width = (int) toolkit.getScreenSize().getWidth();
        int Height = (int) toolkit.getScreenSize().getHeight();
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(Width, Height));

    }


    @Test
    public void addToCartTest(){

        driver.get(baseURL);
        HomePage homePage = new HomePage(driver);
        homePage.addProductToCart().navigateToCartSummary().navigateToAuth().navToRegistration("sdsd@sesdfsd.com");  // after doing al the transaction translates to  ....  new AddToCartPopUp(driver);


//        AddToCartPopUp addToCartPopUp = new AddToCartPopUp(driver);
//        addToCartPopUp.navigateToCartSummary();
//
//
//
//        CartSummaryPage cartSummaryPage = new CartSummaryPage(driver);
//        cartSummaryPage.navigateToAuth();
//
//        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
//        authenticationPage.navToRegistration("test_rob" +  System.currentTimeMillis() + "@mailinator.com");

        // refactor using the concept of method chaining .. or return types of navigational and non navoigational methods ...
    }

    //@Test
    public void testOne(){

        driver.get(baseURL);
        HomePage page = new HomePage(driver);
        page.getItemNames();
        page.getItemPrices();
    }


   @AfterMethod
    public void tearDown(){

       driver.close();
       driver.quit();
       System.out.println("closing the tests");
   }
}
