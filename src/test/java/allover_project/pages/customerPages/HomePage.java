package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

// dimitris
    public HomePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//span[.='Sign In']")
    public WebElement signIn;


}
