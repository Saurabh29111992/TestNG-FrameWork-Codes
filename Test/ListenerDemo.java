package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(ListenerClass.class)

public class ListenerDemo 
{
	
	@Test
	public void login() throws InterruptedException
	{
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open Url
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	    
		//Enter User Name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//Click/Submit on Login button
		driver.findElement(By.id("login-button")).submit();
		Thread.sleep(2000);
		
		//Verify Webpage Title
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
	}
	        @Test
	        public void testFailed()
	        {
	        	
	        	System.out.println("Failed Test Case...");
	        	Assert.assertTrue(false);
	        }
	
	
	        @Test
	        public void testSkipped()
	        {
	        	
	        	System.out.println("Skipped Test Case...");
	        	throw new SkipException("Skip Exception Thrown....");
	        	
	        }

}
