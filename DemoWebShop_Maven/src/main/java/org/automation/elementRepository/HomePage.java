package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	 @FindBy(linkText="Register")
	 private WebElement registerLink;
	 
	 @FindBy(linkText="Log in")
	 private WebElement loginLink;
	 
	 @FindBy(linkText="Digital downloads")
	private WebElement digitalDownloadLink;
	 
	 @FindBy(xpath="//span[text()='Wishlist']")
		private WebElement WislistLink;
	 
	 
	 
	 public WebElement getWislistLink() {
		return WislistLink;
	}

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	@FindBy(linkText="Log out")
	 private WebElement logoutLink;
	 
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Books')]")
	 private WebElement booksLink;
	 
	public WebElement getBooksLink() {
		return booksLink;
	}

	public  HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	 
}
