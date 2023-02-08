package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionDemo 
{
	
	@Test
	public void testmethod()
	{
		
		
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//Open URL 
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
			//Verifying expected title
		System.out.println("Verifying Title.........");
		String expectedtitle = "Automation Testing Practice";
		String actualtitle =  driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle, "Title Verification");
		
		
		//Verifying presence of Wikipedia Icon
		System.out.println("verifying presence of Wikipedia Icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		
		//Verifying presence of Wikipedia-search-button
	    System.out.println("verifying presence of Wikipedia-search-button");
		WebElement searchbtn = driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(searchbtn.isDisplayed());
				
	
	    driver.close();
	
	
	}
	



}
