package day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_4 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countrydp = driver.findElement(By.xpath("//select[@id='country']"));
		
		// using select class the we can select the one of the option
		
		Select dropdown = new Select(countrydp);
		// select one of the options from the dropdown
		dropdown.selectByVisibleText("United States");
		//dropdown.selectByValue("");
		//dropdown.selectByIndex(0);
		
		// Total Number of dropdown
		
	    List<WebElement> option = dropdown.getOptions();
		System.out.println("Total Number of options: "+option.size());		
		
		// print all the options from the dropdown
		
		
		for(int i = 0;i<option.size();i++)
		{
			
			String opt = option.get(i).getText();
			System.out.println(opt);
			
		}
		// ------------------or---------------------//
		
		for(WebElement opt:option)
		{
			System.out.print(opt.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
