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

public class FixedDepositeCalculator_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.taxbuddy.com/allcalculators/fixed-deposits");
		driver.manage().window().maximize();
	
		String file = System.getProperty("user.dir")+"\\testdata\\fdcal.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "Sheet2");
		
		// read the data by using loop
		
		for(int i = 1;i<=rows;i++)
		{
			// read the data from the Excel 
			
			String prin = ExcelUtils.getCellData(file, "Sheet2", i, 0);
			String rate_of_inter = ExcelUtils.getCellData(file, "Sheet2", i, 1);
			String peri1 = ExcelUtils.getCellData(file, "Sheet2", i, 2);
			String peri2 = ExcelUtils.getCellData(file, "Sheet2", i, 3);
			String comp = ExcelUtils.getCellData(file, "Sheet2", i, 4);
			String exp_mat_value = ExcelUtils.getCellData(file, "Sheet2", i, 5);
			
			// passing the Excel data into the Applications
			
			driver.findElement(By.xpath("//input[@id='input_comp-lsg06lnp']")).sendKeys(prin);
			driver.findElement(By.xpath("//input[@id='input_comp-lsg06lnr1']")).sendKeys(rate_of_inter);
			driver.findElement(By.xpath("//input[@id='input_comp-lsg06lnt1']")).sendKeys(peri1);
			driver.findElement(By.xpath("//input[@id='input_comp-lsmq4zt1']")).sendKeys(peri2);
			
			      // compound drop down
			WebElement compdpEle = driver.findElement(By.xpath("//select[@id='collection_comp-lsb2er3s3']"));
			
			Select compdp = new Select(compdpEle);
			
			compdp.selectByVisibleText(comp);
			
			      // click on calculation button
			JavascriptExecutor js  = (JavascriptExecutor) driver;
			
			WebElement calbutton = driver.findElement(By.xpath("//button[@aria-label='Calculate']//div[@class='StylableButton2545352419__container']"));
			js.executeScript("arguments[0].click();", calbutton);
			
			// validation and update Excel sheet with the pass or fails status
			
			
			String act_mat_value = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped']//tr[5]//td[2][@class = 'text-right']")).getText();
		
			
			if(act_mat_value.equals(exp_mat_value))
			{	
				System.out.println("Test Passed");
				ExcelUtils.setCellData(file, "Sheet2", i, 7, "Passed");
				ExcelUtils.fillGreenColor(file, "Sheet2", i, 7);
				
			}
			else
			{
                System.out.println("Test Failed");
				ExcelUtils.setCellData(file, "Sheet2", i, 7, "Failed");
				ExcelUtils.fillGreenColor(file, "Sheet2", i, 7);
			}
			
			Thread.sleep(3000);
			
			WebElement cal_again = driver.findElement(By.xpath("//button[contains(text(),'Calculate')]"));
			js.executeScript("arguments[0].click();", cal_again);
			
		}
		
	}

}
