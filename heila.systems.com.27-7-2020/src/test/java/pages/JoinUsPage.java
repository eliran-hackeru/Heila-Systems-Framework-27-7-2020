package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utility.Helper;

public class JoinUsPage 
{
	WebDriver driver;
	
	public JoinUsPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id = "register") WebElement registerButton;
	
	public void joinUs()
	{
		Helper.waitForElementByID(driver, "register");
		
		registerButton.click();
	}
	
	public void assertTitle()
	{
		Assert.assertEquals(driver.getTitle(), "students-aid.org");
		System.out.println("Assert passed");
	}
}
