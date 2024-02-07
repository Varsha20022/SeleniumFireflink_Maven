package org.automation.testscripts;

import org.automation.elementRepository.BooksPage;
import org.automation.elementRepository.FictionExPage;
import org.automation.elementRepository.WishlistPage;
import org.automation.genericLibrary.baseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishlistTestCase extends baseTest
{
	@Test
	public void addToWishlistTestCase() {
		
		home.getBooksLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "books page not displayed");
		Reporter.log("Books page displayed", true);
		
		BooksPage books_Page=new BooksPage(driver);
		books_Page.getFictionEXBook().click();
		
		
		FictionExPage Ex_Page=new FictionExPage(driver);
		
		Assert.assertEquals("Fiction EX" , Ex_Page.getProductName().getText(), "Product not added to wishlist");
		Reporter.log("Product added to wishlist");
		
		Ex_Page.getAddToWishlistButton().click();
		
		Assert.assertEquals(Ex_Page.getAddedToWishlistMessage().isDisplayed(), true, "Product not added");
		Reporter.log("Product added successfully",true);
		
		home.getWislistLink().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/wishlist", "wishlist page not displayed");
		Reporter.log("Wishlist page is displayed" , true);
		
		
		WishlistPage wishlist_Page=new WishlistPage(driver);
		
		wishlist_Page.getRemoveFromWishlistCheckbox().click();
		wishlist_Page.getUpdateWishlist().click();
		
		Assert.assertEquals(wishlist_Page.getEmptyWishlistMessage().isDisplayed(), true, "Product not removed from wishlist");
		Reporter.log("Product removed from wishlist",true);
		
	}

}
