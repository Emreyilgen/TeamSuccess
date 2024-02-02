package allover_project.tests;

import allover_project.utilities.Driver;
import org.testng.annotations.Test;

public class US_02 {

    /*
        User goes to https://allovercommerce.com
    User clicks on register option
    User enters a valid username
    User enters a valid email address
    User enters a valid password
    User clicks Privacy Policy
    User click on SING UP button
    Verify the account is created

     */


    @Test
    public void test1(){

        Driver.getDriver().get("https://allovercommerce.com");




    }

}
