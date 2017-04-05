package com.shailin.practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by chandrad on 3/28/17.
 */
public class HomePage extends BasePage {

    WebDriverWait wait ;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForPageLoad();
    }


    @FindBy(id = "home-page-tabs")
    private WebElement catalogTabs ;

    @FindBy(className = "blockbestsellers")
    private WebElement bestSellerCatalog ;

    @FindBy(className = "homefeatured")
    private WebElement popularCatalog ;

    //concept of list of weblements ...
    @FindBy(xpath="//ul[@id='homefeatured']/li//div[@class='right-block']//a[@class='product-name']")
    private List<WebElement> productNames ;

    //concept of list of weblements ...
    @FindBy(xpath="//ul[@id='homefeatured']/li//div[@class='right-block']//span[@itemprop='price']")
    private List<WebElement> productPrices ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]/div")
    private WebElement productContainer1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]/div")
    private WebElement productContainer2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]/div")
    private WebElement productContainer3 ;

    //concept of index
    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']//a[@class='product-name']")
    private static WebElement productName1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]//div[@class='right-block']//a[@class='product-name']")
    private WebElement productName2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//div[@class='right-block']//a[@class='product-name']")
    private WebElement productName3 ;

    //concept of custom attributes
    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[2]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice2 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice3 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[3]//div[@class='right-block']//a[@title='Add to cart']")
    private WebElement addToCartButton3 ;

    public void waitForPageLoad(){
        waitForElement(catalogTabs);
    }

    public void addProductToCart(){
        Actions action = new Actions(driver);
            action.moveToElement(productContainer3).build().perform();
            waitForElement(addToCartButton3);
            addToCartButton3.click();
    }



    public void getItemNames(){

        System.out.println(productName1.getText());
        System.out.println(productName2.getText());
        System.out.println(productName3.getText());

    }

    public void getItemPrices(){

        System.out.println(productPrice1.getText());
        System.out.println(productPrice2.getText());
        System.out.println(productPrice3.getText());

    }




}
