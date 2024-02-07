package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email")
     private WebElement emailTextFeild;
    
	@FindBy(id="Password")
	private WebElement passwordTextFeild;
    
	@FindBy(id="RememberMe")
	private WebElement remembermeCheckBox;
    
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
    
	@FindBy(xpath="//input[@value='Register']")

	private WebElement registerButton;



public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public WebElement getEmailTextFeild() {
	return emailTextFeild;
}



public WebElement getPasswordTextFeild() {
	return passwordTextFeild;
}



public WebElement getRemembermeCheckBox() {
	return remembermeCheckBox;
}



public WebElement getLoginButton() {
	return loginButton;
}



public WebElement getRegisterButton() {
	return registerButton;
}
}

