package org.automation.genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonUtiltiy {
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(2000);
	}
	
	
 public void takeScreenShot(WebDriver driver, String name) throws IOException
 {
TakesScreenshot ts = (TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File trg = new File(FrameWorkConstans.screenShot_Path+name+ ".png");
FileHandler.copy(src, trg);
 }
 
 public void selectDropDownByIndex(WebElement dropdown,int indexNum)
 {
	 Select s=new Select(dropdown);
	 s.selectByIndex(indexNum);
 }
 public void selectDropDownByValue(WebElement dropdown,String idValue)
 {
	 Select s=new Select(dropdown);
	 s.selectByValue(idValue);
 }
 public void selectDropDownByVisibleText(WebElement dropdown,String VisText)
 {
	 Select s=new Select(dropdown);
	 s.selectByVisibleText(VisText);
 }
 
 public void scrollByJavaScriptExecutor(WebDriver driver,int x, int y) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(x,y);");
	}
	
	public void scrollByJavaScriptExecutorByArguments(WebDriver driver, WebElement target, boolean value) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(value);", target);
	}
	
	public void scrollByAmount(WebDriver driver, int x, int y) {
		Actions actions=new Actions(driver);
		actions.scrollByAmount(x, y).perform();
	}
	
	public void scrollByOrigin(WebDriver driver,WebElement element, int x, int y) {
		Actions actions=new Actions(driver);
		ScrollOrigin origin = ScrollOrigin.fromElement(element);
		actions.scrollFromOrigin(origin, x, y).perform();
	}
	
	public void scrollToElement(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		try {
		actions.scrollToElement(element).perform();
		}
		catch(MoveTargetOutOfBoundsException e) {
			System.out.println("exception handled");
		}
	} 
}
