package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_Method {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*
		//isDisplayed
		
	   	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo is: "+logo.isDisplayed());
			
		
		//isEnabled
		
	     WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	     
	     System.out.println(searchbox.isDisplayed());
	     System.out.println(searchbox.isEnabled());
	     searchbox.sendKeys("Macbook");
	     
	     */
	     
		 driver.findElement(By.xpath("//a[normalize-space()='Register']")).click(); 
		
		
	     //isSelected
	     
	     WebElement male_rd_button =  driver.findElement(By.xpath("//input[@id='gender-male']"));
	     WebElement female_rd_button = driver.findElement(By.xpath("//input[@id='gender-female']")); 
	     
	     System.out.print("Before selection...........");
	     System.out.println(male_rd_button.isSelected());
	     System.out.println(female_rd_button.isSelected());
	     
	     System.out.println("After selection of male radio button......");
	     
	     male_rd_button.click();
	     System.out.println(male_rd_button.isSelected());
	     System.out.println(female_rd_button.isSelected());
	     
	    
	     System.out.println("After selection of female radio button: ");
	     female_rd_button.click();
	     System.out.println(male_rd_button.isSelected());
	     System.out.println(female_rd_button.isSelected());
	     
	     
	     
	     

	}

}
