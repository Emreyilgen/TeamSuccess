package allover_project.tests;

import allover_project.pages.customerPages.WishListPage;
import allover_project.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_08 {
    WishListPage wishListPage = new WishListPage();

    @Test
    public void test01() {
//    User must go to Home page button
        Driver.getDriver().get("https://allovercommerce.com/");
//    User must search specific items
        wishListPage.searchBox.click();
        wishListPage.searchBox.sendKeys("camera", Keys.ENTER);
//    user must click the heart icon of a specific product
        wishListPage.wishListIcon.click();
//    User must see heart icon filled with color
        Assert.assertTrue(wishListPage.wishListIcon.isDisplayed());
//    user must see the wishlist icon (beside to the search box)
//    User must click on the wishlist icon(heart icon)
        wishListPage.wishListIconHomePage.click();
//    User must see the product in the wishlist
        wishListPage.productInTheWishList.isDisplayed();
//    User must see the same products icon, price, stock status in stock and actions element
//    user must see and click the "quick view" button
        wishListPage.quickViewButton.click();
//    user must see the popup, which is the selected product
        wishListPage.popUpOfTheQuickView.isDisplayed();
//    user should close the popup
        wishListPage.closePopUpOfTheQuickView.click();
//    user must click the "ADD TO CART" button
        wishListPage.addToCart.click();
//    user must see the "product has been added to your cart." message
        wishListPage.SuccessToMessage.isDisplayed();
    }

}
