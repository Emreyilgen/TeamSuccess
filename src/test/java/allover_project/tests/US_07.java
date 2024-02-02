package allover_project.tests;

import allover_project.pages.customerPages.SearchPage;
import allover_project.utilities.Driver;
import allover_project.utilities.WaitUtils;
import org.testng.annotations.Test;

public class US_07 {

    //Test 1
    @Test
    public void compareProductsTest(){

//User navigates to "https://allovercommerce.com"
        Driver.getDriver().get("https://allovercommerce.com");
//User clicks on the 'Sign In' button
        SearchPage searchPage = new SearchPage();
        //searchPage.signIn.click();
        WaitUtils.waitFor(1);
//User signs in the site with valid credentials

        //Username: admin_b197
        //Email: admin_batch197@gmail.com
        //Password: Batch197!
//User clicks on the Sign In button

//User clicks on search button
//User types "bag" in the search button and clicks enter
//User clicks on the compare button of 4 products
        //1-Basic coach bag 2-Women’s White Handbag 3-Best Travel Bag 4-Women’s Fashion Handbag
//User sees the 'Compare Products (3 Products)' sentence below the page with the products he has chosen
//User deletes 1 product (Women’s White Handbag) from the list he has chosen
//User clicks on the 'START COMPARE!' button
//User is supposed to see the word 'Compare' on the page
//'Price', 'Availability', 'Description', 'Ratings & Reviews' and 'SKU' must be visible
//User deletes the products one by one, by clicking cross (X) button above the products
//User is supposed to see 'No products added to the compare' on the page
    }

    /*
    @FindBy (linkText = "Sign In")
    public WebElement signIn;

    @FindBy (xpath = //input[@id='username'])
    public WebElement userName;

    @FindBy (xpath = //input[@id='password'])
    public WebElement passWord;

    @FindBy (xpath = (//button[@type='submit'])[1])
    public WebElement signIn2;

    @FindBy (xpath = (//input[@name='s'])[1])
    public WebElement searchButton;

    FindBy (xpath = //i[@class='w-icon-call'])
    public WebElement searchButtonEnter;

    FindBy (xpath = (//a[@class='compare btn-product-icon'])[4])
    public WebElement basicCoachBagCompareButton;

    FindBy (xpath = (//a[@class='compare btn-product-icon'])[7])
    public WebElement whiteBagCompareButton;

    FindBy (xpath = (//a[@class='compare btn-product-icon'])[8])
    public WebElement bestTravelBagCompareButton;

    FindBy (xpath = (//a[@class='compare btn-product-icon'])[9])
    public WebElement fashionHandBagCompareButton;

    FindBy (xpath = //div[@class='compare-heading'])
    public WebElement compareHeading;

    FindBy (xpath = (//a[@class='btn-remove remove_from_compare fas fa-times'])[2])
    public WebElement whiteBagDeleteButton;

    @FindBy (linkText = "Start Compare !")
    public WebElement startCompareButton;

    FindBy (xpath = //h2[@class='page-title'])
    public WebElement comparePageTitle;




     */


    //Test 2
//User navigates to "https://allovercommerce.com"
//User signs in the site with valid credentials
    //Username: admin_b197
    //Email: admin_batch197@gmail.com
    //Password: Batch197!
//User clicks on the search button
//User types "ski boots" in the search button and clicks enter
//User sees 1 product only on the screen
//User clicks on the compare button of the product
//User sees the 'Compare Products' sentence below the page with the product he has chosen
//User clicks on the 'START COMPARE!' button
//User is supposed to see the word 'Compare' on the page
//User is not able to compare the product because there in not any other product to compare
//User deletes the product by clicking cross (X) button above the product
//User is supposed to see 'No products added to the compare' on the page














}
