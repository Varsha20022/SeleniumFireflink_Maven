package org.automation.testscripts;

import java.util.List;

import org.automation.elementRepository.digitalDownloadPage;
import org.automation.genericLibrary.baseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.automation.genericLibrary.ListenersImplementation.class)
public class addToCartTestCase extends baseTest {
	@Test
	public void addToCart() throws InterruptedException {
       //Navigate to digital Download Page
		
		home.getDigitalDownloadLink().click();
		digitalDownloadPage ddpage=new digitalDownloadPage(driver);
		List<WebElement> prod = ddpage.getProducts();
		for ( WebElement products: prod) 
		{ 
			Thread.sleep(2000);
			products.click();
		}
		ddpage.getShoppingCartLink().click();
		//Verify whether all the products is added to cart
//		boolean addedProducts = ddpage.getAddedProduct().isDisplayed();
//		Assert.assertEquals(addedProducts, true,"Products are not added to cart");
//		Reporter.log("Product is added to cart successfully",true);
		//Remove all the products from cart
		List<WebElement> removecart = ddpage.getRemoveFromCartCheckBox();
		for ( WebElement remove : removecart ) 
		{
			remove.click();
		}
		ddpage.getUpdateCartButton().click();
		//Verify whether all the products is removed from cart or not
		Thread.sleep(2000);;
		boolean emptyCart = ddpage.getCartIsEmptyLink().isDisplayed();
		Assert.assertEquals(emptyCart, true,"Products Are not removed from the cart");
		Reporter.log("Product is removed successfully from cart");
		
	}
	
}
