package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//li[@id='menu-item-1079']/a")
    public WebElement myAccount;   //dimitris

    @FindBy (xpath = "//a[.='Account details']")
    public WebElement accountDetails;

    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addresses;

    @FindBy(xpath = "//a[.='Edit Your Billing Address']")
    public WebElement billingAccount;

}
