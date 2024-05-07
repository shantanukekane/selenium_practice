package day41;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
	WebElement img_logo;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement clicklogin;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	/*
	@FindBy(how = How.TAG_NAME,using ="a" )
	List<WebElement> links2; 
	
	@FindBy(how = How.XPATH,using = "//input[@placeholder='Password']")
	WebElement txtpass;
	*/
	
	// Action Methods
	
	public boolean checkLogopresence()
	{
		boolean status = img_logo.isDisplayed();
		return status;
	}
	
	private Object tagName(String string) {
		// TODO Auto-generated method stub
		return null;
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
