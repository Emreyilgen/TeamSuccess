package allover_project.tests;

import allover_project.pages.customerPages.SearchPage;
import allover_project.utilities.Driver;
import allover_project.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class US_01 {
    SearchPage searchPage = new SearchPage();

    @BeforeTest public void registerPageSetUp(){
        Driver.getDriver().get("https://allovercommerce.com/");
        Driver.getDriver().manage().window().maximize();
        WaitUtils.waitFor(2);

    }

    @Test void testCase01(){

//    User should click to register button right corner of the page
       searchPage.registerIcon.click();

//    Username must be entered (can contain lowercase letters, uppercase letters, numbers and special characters)
        searchPage.username.sendKeys("mmm");

//    e-mail should be entered(with the format of abc@abc.com )
        searchPage.email.sendKeys("mmm@gmail.com");

//    Password should be entered. (The password must be at least 12 characters long.
//    To make it stronger, upper and lower case letters, numbers and ! " ? $ % ^ & should be used. )
        searchPage.password.sendKeys("Mm123456789!");


//    Click the  "I agree to the privacy policy" box
        searchPage.privacyPolicyBox.click();


//    Click the SIGN UP button
        searchPage.signUpButton.click();

    }
    @Test void testCase02(){
//        User should click to register button right corner of the page
        searchPage.registerIcon.click();


//        Username must be entered (can contain lowercase letters, uppercase letters, numbers and special characters)
        searchPage.username.sendKeys("bbb");


//       E-mail should be entered(with the format of abc@abc.com
        searchPage.email.sendKeys("bbb@gmail.com");


//        Password should be entered. (The password must be at least 12 characters long.
//        To make it stronger, upper and lower case letters, numbers and ! " ? $ % ^ & should be used. )
        searchPage.password.sendKeys("Bb123456789!");


//        Do not click the "I agree to the privacy policy" and Click the SIGN UP button
        searchPage.signUpButton.click();

    }
    @Test void testCase03(){
//        User should click to register button right corner of the page
        searchPage.registerIcon.click();

//        Skip the user name part,  Skip the email part,Skip the password part And Click "I agree to the privacy policy" part
        searchPage.privacyPolicyBox.click();


//        Click the SIGN UP button
        searchPage.signUpButton.click();

//        SIGN UP button should be clickable(without entering credentials for Username, Email address and Password SIGN UP button should be clickable)
        Assert.assertTrue(searchPage.signUpButton.isSelected());
    }
}
