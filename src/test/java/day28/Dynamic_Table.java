package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Table {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		
	    WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.click();
		username.sendKeys("demo");
		
		
		WebElement password =  driver.findElement(By.xpath("//input[@id='input-password']"));
		password.click();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText(); //Showing 1 to 10 of 19360 (1936 Pages)
		
		
		int total_page = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1)); // 1936	
		
		
		for(int p = 1;p<=5;p++) //  int p = 1;p<=total_page;p++
		{
			if(total_page>1)
			{
			
			WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='["+p+"]']"));
			System.out.println("Active page: "+active_page.getText());
			active_page.click();
			Thread.sleep(2000);
			
			}
		
		  int rows = driver.findElements(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr")).size();
		  System.out.print("Number of rows: "+rows);
		  
		  for(int r = 1;r<=rows;r++)
		  {
			  
				 String customer_name = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				 String email = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				 String status = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
		  }
		
		}

		driver.quit();
		
	}

}
