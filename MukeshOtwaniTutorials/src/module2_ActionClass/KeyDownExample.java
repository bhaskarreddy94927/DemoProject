package module2_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyDownExample {
    WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://selenium4testing.com/");
	}
	
	@Test
	public void f() throws Exception{
		 driver.findElement(By.xpath("//img[@id='closediv']")).click();
         Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		 
		act.contextClick(driver.findElement(By.linkText("Manual FAQs"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
}
