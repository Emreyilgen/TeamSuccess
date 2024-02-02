package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
        // dimitris
    public SignInPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (id ="username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement signInButton;
}
