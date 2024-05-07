package day41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	
	LoginPage(WebDriver driver)
	{
		this.driver = driver;	
	
	}
	// locators
	
	By img_logo_loc = By.xpath("//img[@alt='company-branding']");
    By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");	
	By submit_btn_loc = By.xpath("//button[normalize-space()='Login']");
	
	// Action methods
	
	
	public boolean checklogopresence()
	{
	   boolean status = driver.findElement(img_logo_loc).isDisplayed();
	   return status;
	}
	
	public void setusername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	
	public void setpassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void clickbutton()
	{
		driver.findElement(txt_password_loc).click();
	}
	
	
}
