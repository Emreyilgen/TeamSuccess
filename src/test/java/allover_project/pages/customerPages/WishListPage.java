package allover_project.pages.customerPages;

import allover_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
    public WishListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "(//*[@name='s'])[1]")
    public WebElement searchBox; //emrey
    @FindBy(xpath = "(//div//a)[31]")
    public WebElement wishListIcon; //emrey
    @FindBy(xpath = "//*[@class='w-icon-heart']")
    public WebElement wishListIconHomePage; //emrey
    @FindBy(xpath = "(//tr)[2]")
    public WebElement productInTheWishList; //emrey
    @FindBy(xpath = "//*[@title='Quick View']")
    public WebElement quickViewButton; //emrey
    @FindBy(xpath = "//*[@class='mfp-figure']")
    public WebElement popUpOfTheQuickView; //emrey
    @FindBy(xpath = "//*[@title='Close (Esc)']")
    public WebElement closePopUpOfTheQuickView; //emrey
    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCart; //emrey
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement SuccessToMessage; //emrey


    /*

    we have all
     */








}
