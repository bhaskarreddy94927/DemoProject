package topic_15_Module3_PageScrollExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll_UsingScrollTo_Y_Cordinates {
	
	WebDriver driver;

	
	@Test(enabled=true)
	public void f3(){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("//input[@id='persistent']"));
		// Scroll the browser to the element's Y position
		 
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
		
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().x+")");
		  
		element.click();
		
	}
}
