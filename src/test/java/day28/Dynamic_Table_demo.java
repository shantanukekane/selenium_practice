package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table_demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
		int total_pages = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		System.out.println("Total Number of Pages: "+total_pages);
		
		for(int p = 1;p<=total_pages;p++)
		{
			if(total_pages>1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]//a"));
			    System.out.println("Active pages : "+active_page.getText());
			    active_page.click();
			    Thread.sleep(2000);
			    
			}
		
		   int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		   System.out.print("Total Number of rows: "+rows);
		   
		   for(int r= 1;r<=rows;r++)
		   {
		     
			 String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]")).getText();
			 String Name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
			 String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
		   
			 
			 System.out.print(id+"       "+Name+"        "+price);
			 
		   }
		   
		
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
