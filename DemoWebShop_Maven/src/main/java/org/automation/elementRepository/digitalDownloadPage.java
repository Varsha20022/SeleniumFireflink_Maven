package org.automation.elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class digitalDownloadPage {
	
	
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private List<WebElement> products;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
//	@FindBy(xpath="//span[text()='(3)']")
//	private WebElement addedProduct;
	
	@FindBy(xpath="//input[@name='removefromcart']")
	private List<WebElement> removeFromCartCheckBox;
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement updateCartButton;
	
	@FindBy(xpath="//div[contains(text(),'Your Shopping Cart is empty!')]")
	private WebElement cartIsEmptyLink;
	
	public digitalDownloadPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	public List<WebElement> getProducts() {
		return products;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

//	public WebElement getAddedProduct() {
//		return addedProduct;
	//}

	public List<WebElement> getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getCartIsEmptyLink() {
		return cartIsEmptyLink;
	}
	
	
	
	

}
