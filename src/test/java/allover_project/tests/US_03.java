package allover_project.tests;

import allover_project.pages.customerPages.*;
import allover_project.utilities.*;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class US_03 {
//           User should be able to add Billing Address.
//            (My Account - Adressses - Billing Address)
//            US_03_Tc01
//            1- User should navigate to "https://allovercommerce.com" User must see message "Address Changed Successfully"
//            2- User signs in the site
//            3- User clicks on My account
//            4- User clicks on Account Details
//		      5- User enters First name
//            6- User enters Last name
//            7- User enters Display name
//            8- User enters Email address		User must see message "Address Changed Successfully"
//            9- User clicks on SAVE CHANGES
//            10- User clicks on Addresses
//            11- User clicks on EDIT YOUR BILLING ADDRESS
//            12- User sees First name, Last name and Email address come up automatically
//            13- User enters Country/Region, Street address, Town/ City, ZIP code, State and Phone
//            14- User clicks on SAVE CHANGES
//		      15- User must see message "Address Changed Successfully"

    @Test
    public void testCase01(){
        HomePage homePage= new HomePage();
        SignInPage signInPage = new SignInPage();
        MyAccountPage myAccountPage = new MyAccountPage();
        AccountDetailsPage accountDetailsPage =new AccountDetailsPage();
        AddressPage addressPage= new AddressPage();

//            1- User should navigate to "https://allovercommerce.com"
        Driver.getDriver().get(ConfigReader.getProperty("allover_commerce_url"));
        WaitUtils.waitFor(1);

//            2- User signs in the site
        BrowserUtils.clickWithTimeOut(homePage.signIn,1);
        BrowserUtils.sendKeysWithTimeout(signInPage.username,ConfigReader.getProperty("allover_commerce_email"),1);
        BrowserUtils.sendKeysWithTimeout(signInPage.password,ConfigReader.getProperty("allover_commerce_password"),1);
        WaitUtils.waitFor(1);
        BrowserUtils.clickWithTimeOut(signInPage.signInButton,1);
        WaitUtils.waitFor(1);

//      3- User clicks on My account
        JSUtils.JSscrollAllTheWayDown();
        WaitUtils.waitFor(2);
        BrowserUtils.clickWithTimeOut(myAccountPage.myAccount,3);
        WaitUtils.waitFor(1);

//      4- User clicks on Account Details
        BrowserUtils.clickWithTimeOut(myAccountPage.accountDetails,3);
        WaitUtils.waitFor(1);

//		5- User enters First name
        BrowserUtils.sendKeysWithTimeout(accountDetailsPage.accountFirstName," ",1);
        BrowserUtils.sendKeysWithTimeout(accountDetailsPage.accountFirstName, ConfigReader.getProperty("allover_commerce_firstname"),1);
        WaitUtils.waitFor(1);

//      6- User enters Last name
        BrowserUtils.sendKeysWithTimeout(accountDetailsPage.accountLastName," ",1);
        BrowserUtils.sendKeysWithTimeout(accountDetailsPage.accountLastName, ConfigReader.getProperty("allover_commerce_lastname"),1);
        WaitUtils.waitFor(1);

//      7- User enters Display name
        BrowserUtils.verifyElementDisplayed(accountDetailsPage.accountDispayName);
        WaitUtils.waitFor(1);

//      8- User enters Email address
        BrowserUtils.verifyElementDisplayed(accountDetailsPage.accountEmail);
        WaitUtils.waitFor(1);

//      9- User clicks on SAVE CHANGES
        JSUtils.JSscrollAllTheWayDown();
        BrowserUtils.clickWithTimeOut(accountDetailsPage.saveButton,3); //don't click
        WaitUtils.waitFor(1);

//        10- User clicks on Addresses
        BrowserUtils.clickWithTimeOut(myAccountPage.addresses,3); //don't click
        WaitUtils.waitFor(1);

//       11- User clicks on EDIT YOUR BILLING ADDRESS
        BrowserUtils.clickWithTimeOut(myAccountPage.billingAccount,3);

//       12- User sees First name, Last name and Email address come up automatically
        BrowserUtils.verifyElementDisplayed(addressPage.billingFirstName);
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(addressPage.billingLastName);
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(addressPage.billingEmail);
        WaitUtils.waitFor(2);

//      13- User enters Country/Region, Street address, Town/ City, ZIP code, State and Phone
//        BrowserUtils.sendKeysWithTimeout(addressPage.billingCountry,ConfigReader.getProperty("allover_commerce_country"),5);
        BrowserUtils.dropdownSelectOption(addressPage.billingCountry, ConfigReader.getProperty("allover_commerce_country"));
        WaitUtils.waitFor(3);

        BrowserUtils.sendKeysWithTimeout(addressPage.billingStreetAddress,ConfigReader.getProperty("allover_commerce_street"),5);
        WaitUtils.waitFor(1);
        BrowserUtils.sendKeysWithTimeout(addressPage.billingCity,ConfigReader.getProperty("allover_commerce_city"),5);
        WaitUtils.waitFor(2);

        BrowserUtils.dropdownSelectOption(addressPage.billingState,ConfigReader.getProperty("allover_commerce_state"));
//        BrowserUtils.sendKeysWithTimeout(addressPage.billingState, ConfigReader.getProperty("allover_commerce_state"),5);
        WaitUtils.waitFor(3);

        BrowserUtils.sendKeysWithTimeout(addressPage.billingPostcode,ConfigReader.getProperty("allover_commerce_postcode"),5);
        WaitUtils.waitFor(1);
        BrowserUtils.sendKeysWithTimeout(addressPage.billingPhone,ConfigReader.getProperty("allover_commerce_phone"),5);
        WaitUtils.waitFor(1);

//      14- User clicks on SAVE CHANGES
        BrowserUtils.clickWithTimeOut(addressPage.billingSaveButton,5);
        WaitUtils.waitFor(1);

//		15- User must see message "Address Changed Successfully"























    }





//            US03_TC01
//            1- User should navigate to "https://allovercommerce.com/"
//      	  2- User signs in the site
//            3- User clicks on My account
//            4- User clicks on Addresses
//            5- User clicks on Edit Your Billing Address
//            6- User must sees First name, Last name and email address empty
//            7- User enters Keys all fields
//            8- User clicks on SAVE CHANGES
//            9- User sees message "Phone is a required field"

}
