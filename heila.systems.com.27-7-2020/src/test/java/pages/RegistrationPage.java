package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import utility.Helper;

public class RegistrationPage
{
	WebDriver driver;
	
	public RegistrationPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy (id = "firstname") WebElement firstName;
	
	@FindBy (id = "lastname") WebElement lastName;
	
	@FindBy (id = "personalId") WebElement personalId;
	
	@FindBy (id = "phone") WebElement phone;
	
	@FindBy (id = "dateOfBirth") WebElement dateOfBirth;
	
//	@FindBy(xpath = "//div[@class='gender female h5 col-4 py-2 px-0 box-select active'][contains(.,'אישה')]") WebElement femaleGender;
	
	@FindBy(xpath="//*[@id='form-register']/div[1]/div[4]/div[2]/div/div/div[2]") WebElement femaleGender;
	
	@FindBy (id = "agreeTerms") WebElement agreeButton;
	
	@FindBy(xpath="//*[@id=\"form-buttons\"]/div/button") WebElement nextPage;
	
	@FindBy(id = "isStudentNo") WebElement noStudent;
	
	@FindBy(id = "residence") WebElement residence;
	
	@FindBy(id = "hasCarYes") WebElement car;
	
	@FindBy(xpath = "//*[@id=\"form-register\"]/div[3]/div[4]/div[2]/div/div/div[4]/label/input") WebElement volunteer;
	
	@FindBy(xpath = "//*[@id=\"form-register\"]/div[3]/div[4]/div[7]/div/div/div/label/input") WebElement days;
	
	@FindBy(xpath = "//*[@id=\"form-register\"]/div[3]/div[4]/div[10]/div/div/div/label/input") WebElement anyTime;
	
	@FindBy(xpath = "//*[@id=\"form-register\"]/div[3]/div[4]/div[12]/div[1]/div/div/label/input") WebElement hebrew;
	
	@FindBy(id = "email") WebElement email;
	
	@FindBy(id = "password") WebElement password;
	
	public void insertDetails(String ufName, String ulName, String uID, String uPhone, String uDay, String uMonth, String uYear)
	{
		firstName.sendKeys(ufName);
		lastName.sendKeys(ulName);
		personalId.sendKeys(uID);
		phone.sendKeys(uPhone);
		dateOfBirth.sendKeys(uDay);
		dateOfBirth.sendKeys(uMonth);
		dateOfBirth.sendKeys(Keys.ARROW_RIGHT);
		dateOfBirth.sendKeys(uYear);
	}
	
	public void pickAGender()
	{
		femaleGender.click();
	}
	
	public void agreeToTerms()
	{
		agreeButton.click();
	}
	
	public void submitDetails()
	{
		nextPage.click();
	}
	
	public void areUAStudent()
	{
		noStudent.click();
	}
	
	public void residenceInfo (String uResidence)
	{
		residence.sendKeys(uResidence);
	}
	
	public void haveACar()
	{
		car.click();
	}
	
	public void volunteerOptions()
	{
		volunteer.click();
		days.click();
		anyTime.click();
	}
	
	public void languageOptions()
	{
		hebrew.click();
	}
	
	public void insertEmail(String uEmail)
	{
		email.sendKeys(uEmail);
	}
	
	public void insertPassword(String uPassword)
	{
		password.sendKeys(uPassword);
	}
}
