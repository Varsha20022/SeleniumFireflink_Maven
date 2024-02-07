package org.automation.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCase {
	@Test
	public void testcase() throws InterruptedException
	{
		String url=System.getProperty("URL");
		String username=System.getProperty("USERNAME");
		String pwd=System.getProperty("PASSWORD");
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}

}
