package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Conditional_command {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		
		/*
		//isDisplayed method
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display Status of logo: "+logo.isDisplayed());
	
		
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println(searchbox.isDisplayed());
		System.out.println(searchbox.isEnabled());
		searchbox.sendKeys("macbook");
		
		*/
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		// Radio Button
	    WebElement male_rd_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
	    WebElement female_rd_button = driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	    // before selection	
		
	    System.out.println("Before Selection..............");
		System.out.println(male_rd_button.isSelected());
		System.out.println(female_rd_button.isSelected());
		
		
		// After selection of male radio button
		System.out.println("After Selection of Radio button................");
		male_rd_button.click();
		System.out.println(male_rd_button.isSelected());
		System.out.println(female_rd_button.isSelected());
		
		// After selection of female radio button
		
		System.out.println("After Selection of Radio button................");
        female_rd_button.click();
        System.out.println(male_rd_button.isSelected());
		System.out.println(female_rd_button.isSelected());
		
        

	}

}
