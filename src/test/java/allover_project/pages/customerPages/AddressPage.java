package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    public AddressPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//input[@name='billing_first_name']")
    public WebElement billingFirstName;

    @FindBy(xpath = "//input[@name='billing_last_name']")
    public WebElement billingLastName;

    @FindBy(xpath = "//input[@name='billing_email']")
    public WebElement billingEmail;

    @FindBy(xpath = "']")
    public WebElement billingCountry;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement billingStreetAddress;
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    public WebElement billingState;
    @FindBy(name = "billing_postcode")
    public WebElement billingPostcode;
    @FindBy(id = "billing_phone")
    public WebElement billingPhone;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement billingSaveButton;



}
