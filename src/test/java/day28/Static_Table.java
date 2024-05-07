package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_Table {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*// approach 1
		// 1) find the total  Number of rows
		
		 List<WebElement> total_rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		 System.out.println("Total Number of rows are: "+total_rows.size());
		
		// 2) find the total number of columns
		 
		 List<WebElement> total_columns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td"));
		 System.out.println("Total Number of columns are: "+total_columns.size());
		
		*/
		
		//1) find the total  Number of rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();		
		System.out.println("Total Number of rows are: "+rows);

		//2) find the total number of columns
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td")).size();
		System.out.println("Total Number of columns are: "+columns);

		// 3) read specific row and column data
		
		 //String author_name = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[4]/td[2]")).getText();
		 //System.out.print("nRead specific data from the table is: "+author_name);
		 
		 
		// 4) read data from all the rows and columns
		 /*
		System.out.println("BookName"+"      "+"Author"+"     "+"Subject"+"     "+"Price");
		
		 for(int r=2;r<=rows;r++)
		 {
			 for(int c = 1;c<=columns;c++)
			 {
				 // if we want to print all the data inside from the table 
				 // then we used one concept which is xpath parameterization
				
				 //System.out.print("BookName"+"     "+"Author"+"    "+"Subject"+"     "+"Price");
				 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.print(value+"\t");
				
			 }
			 System.out.println();
		 }
		 
		 
		// 5) print book names whose auther is amit
		
		 for(int r=2;r<=rows;r++)
		 {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
		    
			if(author.equals("Amit"))
			{
				String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			    System.out.println(BookName+"      "+author);
			
			}
		    
		 }
		 */
		 
		 // print the BookName whose price is 300
		 /*
		 for(int r = 2;r<=rows;r++)
		 {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
		    
			if(price.equals("300"))
			{
				String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			    System.out.println(BookName+"   "+price);
			}
		    
		 }
		
		*/
		
		// 6) find the sum of prices for all the books
		 int sum = 0;
		 for(int r = 2;r<=rows;r++)
		 {
			 
			String price =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum = sum + Integer.parseInt(price);
			
		 }
		 System.out.print("Addition of total Amount: "+sum);


	}

}
