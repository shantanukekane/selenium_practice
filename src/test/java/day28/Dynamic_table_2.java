package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_table_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php?");
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
		
		
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();  // Showing 1 to 10 of 19364 (1937 Pages)
		
		int total_page = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));	
		System.out.print("Total number of pages: "+total_page);
		
		
		for(int p=1;p<=5;p++)      // int p = 1;p<=total_page;p++
		{
			if(total_page>1)
			{
				WebElement Active_page = driver.findElement(By.xpath("//ul[@class = 'pagination']//li["+p+"]"));
				System.out.print("Active pages : "+Active_page.getText());
				Active_page.click();
				Thread.sleep(2000);
		
			}
		
		
			int rows = driver.findElements(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody/tr")).size();
			System.out.print("Total Number of rows: "+rows);
			
			for(int r = 1;r<=rows;r++)
			{
				String customername = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody/tr["+p+"]//td[2]")).getText();
				String Email = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody/tr["+p+"]//td[3]")).getText();
				String Status = driver.findElement(By.xpath("//table[@class = 'table table-bordered table-hover']//tbody/tr["+p+"]//td[4]")).getText();

				System.out.print(customername+"     "+Email+"       "+Status);
			}
		
		}
		
		driver.quit();
		

	}

}
