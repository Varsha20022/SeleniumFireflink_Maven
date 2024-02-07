package org.automation.genericLibrary;
import java.io.IOException;
import java.time.Duration;

import org.automation.elementRepository.HomePage;
import org.automation.elementRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class baseTest {
	
		public WebDriver driver;
		static WebDriver listenerdriver;
		public dataUtility data=new dataUtility();
		public HomePage home;
		public CommonUtiltiy commonUtiltiy=new CommonUtiltiy(); 
    	@Parameters("Browser")
		@BeforeClass(alwaysRun = true)
		 public void launchBrowser(@Optional("Chrome")String browserName) throws IOException
		 {   if(browserName.equals("Chrome"))
		     {
			 driver = new ChromeDriver();
		     }
		 else if (browserName.equals("Edge")) 
		 {
			driver=new EdgeDriver();
		 }
		 else
			 System.out.println("Enter valid Browser name..");
		 listenerdriver=driver;
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get(data.getData("url"));
		 }
		@BeforeMethod(alwaysRun = true)
		public void performLogin() throws IOException
		{    home= new HomePage(driver);
		    home.getLoginLink().click();
		 
		    LoginPage login=new LoginPage(driver);
		    login.getEmailTextFeild().sendKeys(data.getData("email"));
		    login.getPasswordTextFeild().sendKeys(data.getData("pwd"));
		    login.getLoginButton().click();
		}
		
		@AfterMethod(alwaysRun = true)
		public void logOut()
		{
			home.getLogoutLink().click();
		}
		
		@AfterClass(alwaysRun = true)
		public void closeBrowser()
		{
			driver.quit();
		}

	}



