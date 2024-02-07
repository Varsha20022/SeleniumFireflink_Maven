package org.automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextFeild;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextFeild;
	
	@FindBy(id="Email")
	private WebElement emailTextFeild;
	
	@FindBy(id="Password")
	private WebElement passwordTextFeild;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPwdTextFeild;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(xpath="//h1[text()='Register']")
	private WebElement registerText;
	
	@FindBy(partialLinkText="Digital downloads")
	private WebElement digitalDownloadsLink;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextFeild() {
		return firstNameTextFeild;
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getConfirmPwdTextFeild() {
		return confirmPwdTextFeild;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getRegisterText() {
		return registerText;
	}
	
	
	
	

}
