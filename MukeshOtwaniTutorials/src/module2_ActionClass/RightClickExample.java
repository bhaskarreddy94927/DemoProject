package module2_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClickExample {

WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/");
	}
	
	//Example to click on Page
	@Test(enabled=true)
	public void f1() throws Exception{
         driver.findElement(By.xpath("//img[@id='closediv']")).click();
		// Add 5 seconds wait
		Thread.sleep(5000);
		// Create object of actions class
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	//Example to click on an individual element on the Page
		@Test(enabled=true)
		public void f2() throws Exception{
	         driver.findElement(By.xpath("//img[@id='closediv']")).click();
	         Thread.sleep(2000);
	         WebElement hmsLink=driver.findElement(By.linkText("HMS"));
			// Add 5 seconds wait
			Thread.sleep(2000);
			// Create object of actions class
			Actions act = new Actions(driver);
			act.contextClick(hmsLink).perform();
		}
}
