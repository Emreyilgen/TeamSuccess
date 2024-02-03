package allover_project.tests;

import allover_project.pages.customerPages.WishListPage;
import allover_project.utilities.Driver;
import org.testng.annotations.Test;

public class US_08 {
    WishListPage wishListPage = new WishListPage();
    @Test
    public void test01() {
//    User must click the Home page button
        Driver.getDriver().get("https://allovercommerce.com/");
//    User must search specific items
        wishListPage.searchBox.click();
        wishListPage.searchBox.sendKeys("camera");
//    user must click the heart icon of a specific product

//    User must see heart icon filled with color
//    user must see the wishlist icon (beside to the search box)
//    User must click on the wishlist icon(heart icon)
//    User must see the product in the wishlist
//    User must see the same products icon, price, stock status in stock and actions elements
//    user must see and click the "quick view" button
//    user must see the popup, which is the selected product
//    user should close the popup
//    user must click the "ADD TO CART" button
//    user must see the "product has been added to your cart." message
    }

}
