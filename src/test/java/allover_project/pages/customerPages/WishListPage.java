package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
    public WishListPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name ="(//*[@name='s'])[1]")
    public WebElement searchBox; //



}
