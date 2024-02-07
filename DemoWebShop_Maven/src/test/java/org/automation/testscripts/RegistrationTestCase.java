package org.automation.testscripts;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.automation.elementRepository.RegisterPage;
import org.automation.genericLibrary.baseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTestCase extends baseTest {
	
	@Test(dataProvider ="RegisterCredential" )
	public void Register(String firstName, String lastName, String eMail, String Password, String confirmPasssword) throws EncryptedDocumentException, IOException
	{
		Random r=new Random();
		home.getLogoutLink().click();
		home.getRegisterLink().click();
		
		//To perform registration
		RegisterPage reg=new RegisterPage(driver);
		reg.getFemaleRadioButton().click();
		reg.getFirstNameTextFeild().sendKeys(firstName);
		reg.getLastNameTextFeild().sendKeys(lastName);
		reg.getEmailTextFeild().sendKeys(r.nextInt(1000)+eMail);
		reg.getPasswordTextFeild().sendKeys(Password);
		reg.getConfirmPwdTextFeild().sendKeys(confirmPasssword);
		reg.getRegisterButton().click();
		
		//verify whether the user is logged in or not
		boolean regText = reg.getRegisterText().isDisplayed();
		Assert.assertEquals(regText,true,"Registration unsuccessful");
		Reporter.log("Registration successful",true);
		
		
		
		
	}
	
	@DataProvider(name="RegisterCredential")
	public Object[][] dataSupply() throws EncryptedDocumentException, IOException
	{
		return data.getMultipledata("Register");
	}

}
