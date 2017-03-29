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
    public void testOne(){

        driver.get(baseURL);
        HomePage page = new HomePage(driver);
        page.getItemNames();
        page.getItemPrices();
    }


   @AfterMethod
    public void tearDown(){

       driver.quit();
       driver.close();
       System.out.println("closing the tests");
   }
}
