package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo1 
{
	
	WebDriver driver;
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	    //Open Url
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//Verify Webpage Title
		Assert.assertEquals( driver.getTitle(), "Swag Labs" );
		
		driver.quit();
	}
	
	@Test
	public void verifyLogo() throws InterruptedException
	{
		
		//Launch the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//Assert.assertEquals( driver.getTitle(), "Swag Labs" );
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		driver.quit();
	
	
	}
	

}
