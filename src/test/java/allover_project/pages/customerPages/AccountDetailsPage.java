package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {

    public AccountDetailsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (name = "account_first_name")
    public WebElement accountFirstName;

    @FindBy(name = "account_last_name")
    public WebElement accountLastName;

    @FindBy(name = "account_display_name")
    public WebElement accountDispayName;

    @FindBy(id = "account_email")
    public WebElement accountEmail;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement saveButton;

}
