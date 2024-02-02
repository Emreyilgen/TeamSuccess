package allover_project.tests;


import allover_project.pages.customerPages.AddressPage;
import allover_project.pages.customerPages.SearchPage;
import allover_project.utilities.BrowserUtils;
import allover_project.utilities.Driver;
import allover_project.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class US_04 {


    SearchPage searchPage = new SearchPage();
    AddressPage addressPage = new AddressPage();

    @Test
    public void Test_US_04_TC_01() throws InterruptedException {
//1- User should navigate to "https://allovercommerce.com"
        Driver.getDriver().get("https://allovercommerce.com");
        Thread.sleep(2000);
//        searchPage.searchBox.click();
        searchPage.searchBox.sendKeys(Keys.PAGE_DOWN);
//        BrowserUtils.sendKeysWithTimeout(searchPage.searchBox,"Men's Cloting",2);
        WaitUtils.waitForVisibility(searchPage.mensClotingAddToCartButton,2);

//2-User clicks a product's "ADD TO CART" button
        BrowserUtils.clickWithTimeOut(searchPage.mensClotingAddToCartButton,2);

//3-User clicks Chart icon
//        BrowserUtils.clickWithTimeOut(searchPage.chartIcon,1);

//4-User clicks "CHECK OUT" button
//        BrowserUtils.clickWithTimeOut(searchPage.checkOutButton,1);

        searchPage.firstCheckOutButton.click();
//5-User enters First Name
        addressPage.billingAddressFirstName.sendKeys("Ali");
//6-User enters Last Name
        addressPage.billingAddressLastName.sendKeys("Can");
//7-User enters Company Name (optional)
        addressPage.billingCompanyName.sendKeys("ABC");
//8-User selects Country/Region
//        addressPage.billingCountryName.sendKeys(Keys.TAB);
//9-User enters Street Address
        addressPage.billingStreetAddress.sendKeys("Tree Street");
//10-User enters Town/City
        addressPage.billingCity.sendKeys("Elmira" );
//11-User enters State
        addressPage.billingCity.sendKeys(Keys.TAB);
//12-User enters Zip Code  ---> 10022
        addressPage.billingZipCode.sendKeys("10022" );
//13-User enters Phone Number  ---> 5303003030
        addressPage.billingPhoneNumber.sendKeys("5303003030");
//14-User enters email address  ---> emrey498@yahoo.com
        addressPage.billingEmail.sendKeys("emrey498@yahoo.com");
//15-User selects"Ship to a different address?" option
        addressPage.billingEmail.sendKeys(Keys.PAGE_DOWN);
//        WaitUtils.waitForClickablility(addressPage.shipToDifAddress,2);
        addressPage.shipToDifAddress.click();  //?????????????????

//        Actions actions = new Actions(Driver.getDriver());
//        action
//                .sendKeys(addressPage.shippingFirstName,"Ali")
//                .sendKeys(addressPage.shippingLastName, "Can");

//16-User enters First Name
        addressPage.shippingFirstName.sendKeys("Ali");
        addressPage.shippingLastName.sendKeys("Can");
        addressPage.shippingCompanyName.sendKeys("ABC");
        addressPage.shippingCountryName.sendKeys(Keys.TAB);
        addressPage.shippingStreetAddress.sendKeys("Tree Sreet");
        addressPage.shippingCity.sendKeys(Keys.TAB);
//        addressPage.shippingState.sendKeys();
        addressPage.shippingZipCode.sendKeys("10020");
        addressPage.placeOrderButton.click();



//18-User enters Company Name (optional)
//19-User selects Country/Region
//20-User enters Street Address
//21-User enters Town/City
//22-User enters State
//23-User enters Zip Code (5 digits)
//24-User clicks on "PLACE ORDER" button
//25-User should see "Thank you. Your order has been received." message


    }



}
