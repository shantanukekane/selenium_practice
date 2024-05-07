package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*

1) Launch Browser
2) Open URL
   https://opensource-demo.orangehrmlive.com/
3) Provide username - admin
4) provide password - admin123
5) click on login button
6) verify the title of dashboard page
   Exp title : OrangeHRM
7) close browser      

*/

public class OrangeHRMlogintest {

	public static void main(String[] args) throws InterruptedException {
	// we don't need any web driver manager setup for the latest updated drivers
		//WebDriverManager.chromeDriver().Setup();
		
		
		// 1) Launch Browser
		
		//ChromeDriver driver = new ChromeDriver();
		
	     WebDriver driver = new ChromeDriver();

		// 2)  Open URL
	    // https://opensource-demo.orangehrmlive.com/
	
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     Thread.sleep(5000);

		// 3) Provide username - admin
	     
	  //WebElement txtusername = driver.findElement(By.name("username"));
	  //txtusername.sendKeys("Admin");   
	     
	     driver.findElement(By.name("username")).sendKeys("Admin");
	     
	     
	   //  4) provide password - admin123

	     driver.findElement(By.name("password")).sendKeys("admin");
	     
	    // 5) 5) click on login button

	     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	     
	   // 6) verify the title of dashboard page
	    // Exp title : OrangeHRM  
	     
	     String act_title = driver.getTitle();
	     String exp_title = "OrangeHRM";
	     
	     if(act_title.equals(exp_title))
	     {
	    	 System.out.println("Test Passed");	     
	     }
	     else
	     {
	    	 System.out.println("Test failed");
	     }
	     
	     // label Validation after login the URL or web page
	   String act_label = null;
	   try 
	   {
	      act_label =  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	   }
	   catch(Exception e)
	   {
	      act_label = " ";
	   }  
	   
	 String exp_label = "Dashboard";
	  
	  if(act_label.equals(exp_label))
	  {
		  System.out.println("Test Passed");
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
	  
		
		//7) close browser      
	    //driver.close();
	     
	     

		
		
		
		
		
		
		
		

	}

}
