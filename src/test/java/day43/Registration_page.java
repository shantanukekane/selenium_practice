package day43;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration_page {

	WebDriver driver;
	
	// constructor,constructor are typically used to initialize the object
	
	Registration_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// WebElements + Identifier/locator
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement link_register;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement male_rd_button;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txt_firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txt_lastName;
	
	@FindBy(xpath = "//select[@name='DateOfBirthDay']")
	WebElement date_options;
	
	@FindBy(name = "//select[@name='DateOfBirthMonth']")
	WebElement month_dob;
	
	@FindBy(name ="//select[@name='DateOfBirthYear']")
	WebElement year_dob;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@id='Company']")
	WebElement txt_companyName;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement submit_btn;

	// Action Methods
	
	public void clickregisterlink()
	{
		link_register.click();
	}
	
	public void clickRdButton()
	{
		male_rd_button.click();
	}
	
	public void setfirstname(String fname)
	{
		txt_firstName.sendKeys(fname);
	}
	
	
	public void setlastname(String lname)
	{
		txt_lastName.sendKeys(lname);
	}
	
	public void setdate(String date) 
	{
	     Select datedropd = new Select(date_options);
	     
	     datedropd.selectByVisibleText(date);
	
	}

	public void setmonth(String month)
	{
		Select monthdp = new Select(month_dob);
		
		monthdp.selectByVisibleText(month);
		
	}
	
	public void setyear(String year)
	{
		Select yeardp = new Select(year_dob);
		
		yeardp.selectByVisibleText(year);
	}
	
	public void setemail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	
	public void setcompanyName(String cname)
	{
		txt_companyName.sendKeys(cname);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void setconfirmpassword(String confirmpassword)
	{
		confirmPassword.sendKeys(confirmpassword);
	}
	
	
}
