package day34;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositeCalculator_2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
	    String file = System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
	    int rows = ExcelUtils.getRowCount(file, "Sheet1");
	    
	    // here we used for loop to read each and every test data in the Excel sheet
	    
	    for(int i = 1;i<=rows;i++)
	    {
	    	
	    	// read the data from the excel sheet
	    	
	      String princ = ExcelUtils.getCellData(file, "Sheet1", i, 0);
	      String rate_of_intr = ExcelUtils.getCellData(file, "Sheet1", i, 1);
	      String peri1 = ExcelUtils.getCellData(file, "Sheet1", i, 2);
	      String peri2 = ExcelUtils.getCellData(file, "Sheet1", i, 3);
	      String freq = ExcelUtils.getCellData(file, "Sheet1", i, 4);
	      String exp_mat_val = ExcelUtils.getCellData(file, "Sheet1", i, 5);
	    	
	    	
	    	// pass the Excel data into the application
	      
	      driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
	      driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate_of_intr);
	      driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(peri1);
	      
	      //select the option from the period drop down 
	      
	      WebElement peridpEle = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
	      
	      Select peridp = new Select(peridpEle);
	      
	      peridp.selectByVisibleText(peri2);
	      
	      // select the option from the period drop down
	      
	      WebElement freqdpEle = driver.findElement(By.xpath("//select[@id='frequency']"));
	      
	      Select freqdp = new Select(freqdpEle);
	      
	      freqdp.selectByVisibleText(freq);
	      
	      // clicking on cal button
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement cal_button = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	      js.executeScript("arguments[0].click();",cal_button);
	    	
	    	
	      // validation and update the Excel sheet using utility methods
	      
	      String act_ma_val = driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
	      
	       if(Double.parseDouble(exp_mat_val) == Double.parseDouble(act_ma_val))
	       {
	    	   System.out.print("Test Passed");
	    	   ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
	    	   ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
	    	   
	       }
	       else
	       {
	    	   System.out.print("Test failed");
	    	   ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
	    	   ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
	       }
	      
	       Thread.sleep(3000);
	       
	       WebElement clear_button = driver.findElement(By.xpath("//img[@class='PL5']"));
	       js.executeScript("arguments[0].click();", clear_button);
	      
	    }
	   
	}

}
