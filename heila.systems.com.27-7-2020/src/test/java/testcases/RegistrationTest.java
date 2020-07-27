package testcases;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;
import pages.BaseClass;
import pages.JoinUsPage;
import pages.RegistrationPage;
import utility.Helper;

public class RegistrationTest extends BaseClass
{
	@Test(priority=0)
	public void JoinUsApp() throws InterruptedException
	{
		String testName = new Throwable().getStackTrace()[0].getMethodName();
		
		extentTest = extent.createTest(testName);
		
		JoinUsPage joinUsPage = PageFactory.initElements(driver, JoinUsPage.class);
		
		joinUsPage.assertTitle();
		
		Helper.captureScreenshot(driver,testName,"01_BrowserStarted");
		
		joinUsPage.joinUs();
		
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void RegistrationApp() throws InterruptedException
	{
		String testName = new Throwable().getStackTrace()[0].getMethodName();
		
		extentTest = extent.createTest(testName);
		
		RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
		
		registrationPage.insertDetails("מלכה", "פלד", "584661235", "0501234567", "06", "6", "1966");
		
		registrationPage.pickAGender();
		
		registrationPage.agreeToTerms();
		
		registrationPage.submitDetails();
		
		Thread.sleep(2000);
		
		registrationPage.areUAStudent();
		
		registrationPage.submitDetails();
		
		Thread.sleep(2000);
		
		registrationPage.residenceInfo("אבן יהודה");
		
		registrationPage.haveACar();
		
		registrationPage.volunteerOptions();
		
		registrationPage.languageOptions();
		
		registrationPage.submitDetails();
		
		Thread.sleep(2000);
		
		registrationPage.insertEmail("testuser@mail.com");
		
		registrationPage.insertPassword("123456");
		
		registrationPage.submitDetails();
		
		Thread.sleep(3000);
	}
}
