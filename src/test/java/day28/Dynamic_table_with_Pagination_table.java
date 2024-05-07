package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_table_with_Pagination_table {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();// Showing 1 to 10 of 19357 (1936 Pages)
		
		int total_page = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		System.out.println("Total Number of pages: "+total_page);
		
		
		for(int p = 1;p<=5;p++)   // int p = 1;p<=total_page;p++
		{
			if(total_page>1)
			{
				WebElement Active_page =driver.findElement(By.xpath("//ul[@class = 'pagination']//li["+p+"]"));
			    System.out.println("Active page: "+Active_page.getText());
			    Active_page.click();
			    Thread.sleep(2000);
			   
			}
			
			int rows = driver.findElements(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr")).size();
			System.out.print("Number of rows: "+rows);
			
			for(int r = 1;r<=rows;r++)
			{
				
			   String customerName = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			   String Email = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			   String status  = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
			   String date_added = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody//tr["+r+"]//td[6]")).getText();

				
			}
			
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
