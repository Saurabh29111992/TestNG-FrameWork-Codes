package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTestGoogleSearch 
{
	
	    @Test
	    @Parameters({"keyword"})
	    public void googleSearch(String searchdata) //using parameters
	    {
	        
	    	//Launch the browser
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	
	    	driver.get("https://www.google.com");
	    	
	        WebElement searchbox =  driver.findElement(By.name("q"));
	        searchbox.sendKeys(searchdata);
	        
	        
	        Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
	        
	    	driver.quit();	    	
	
	    
	    
	    }
	

}
