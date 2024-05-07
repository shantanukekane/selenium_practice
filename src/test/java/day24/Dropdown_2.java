package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		
		WebElement countrydpEle = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select countrydp = new Select(countrydpEle);
		
		countrydp.selectByVisibleText("India");
		
		//--------or ---------//
		//countrydp.selectByValue("IND");
		
		
		// ------or-----------//
		
		//countrydp.selectByIndex(3); //its our assumptions    indexing start from 0 
		
		// 2) Total Number of values in the drop down
		
	    List<WebElement> options = countrydp.getOptions();
		System.out.println("Total Number of options: "+options.size());
	   
	    // 3) we want to print the all the options in a console window
		
		for(int i = 0;i<options.size();i++)
		{
			
			String option = options.get(i).getText();
			System.out.println(option);
			
		}
		
		// using for each loop
		
		
		
		
		
		for(WebElement option:options)
		{
			String opt = option.getText();
			System.out.println(opt);
		}
		
		
		
		
		
		
		
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
