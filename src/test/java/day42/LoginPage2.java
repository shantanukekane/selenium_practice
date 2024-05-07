package day42;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	
	// constructor
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;   // this.driver is belongs to LoginPage2 page obejct class and and another driver is belongs to test case
		PageFactory.initElements(driver, this);
		
	}
	
	// WebElement + identifier
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement img_logo_loc;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement clicklogin;
	
	
	// Action Methods
	
	public boolean checkLogopresence()
	{
		boolean status = img_logo_loc.isDisplayed();
		return status;
	}
	
	public void setusername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	
	public void clicksubmit()
	{
		clicklogin.click();
	}
	

	
	
	
}
