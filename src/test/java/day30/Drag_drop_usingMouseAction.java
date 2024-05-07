package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop_usingMouseAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		// create a action class
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement Itely = driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, Itely).perform();
		
		
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.dragAndDrop(oslo, Norway).perform();
		
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		
		act.dragAndDrop(stockholm, sweden).perform();
		
		
		
		
		
		
		
		
		
		

	}

}
