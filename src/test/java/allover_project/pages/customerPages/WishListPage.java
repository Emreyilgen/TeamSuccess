package allover_project.pages.customerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage {

    @FindBy(className = "register inline-type")
public WebElement registerIcon;//Gökhan register ıcon on homepage

    @FindBy(id = "reg_username")
    public WebElement username;//Gökhan username of Sign Up part

    @FindBy(id = "reg_email")
    public WebElement email;//Gökhan email of Sign Up part

    @FindBy(id = "reg_password")
    public WebElement password;//Gökhan password of Sign Up part

    @FindBy(id = "register-policy")
    public WebElement privacyPolicyBox;//Gökhan box of Privacy Policy part

    @FindBy(className = "register_as_vendor")
    public WebElement signUpAsAVendor;//Gökhan Sign Up As A Vendor part

    @FindBy(name = "register")
    public WebElement signUpButton;//Gökhan Sign Up Button part

    @FindBy()
    public WebElement becomeAVendor;//Gökhan Become A Vendor part

}
