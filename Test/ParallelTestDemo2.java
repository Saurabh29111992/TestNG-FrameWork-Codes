package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestDemo2 
{
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws InterruptedException 
	{
		
		//Launch the browser 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//Enter User name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//Click on Login button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Thread.sleep(2000);
		
		driver.close();
		
	}







}
