package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting 
{
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br) throws InterruptedException
	{
	      if(br.contentEquals("chrome"))
	      {
	        
	        	WebDriverManager.chromedriver().setup();
	        	driver = new ChromeDriver();
	        	
	      } 	
	        
	      else if(br.equals("edge"))
	      {
	    	  
	    	  WebDriverManager.edgedriver().setup();
	    	  driver = new EdgeDriver();
	      }
	      
	        driver.manage().window().maximize();
	
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Thread.sleep(2000);
	        
	}      
	        @Test(priority=1)
	        void testlogo()
	        {
	        	try 
	        	{
	        	
                   boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();	        	
	        	 
                   Assert.assertEquals(status, true);
	        	}   
                   catch(Exception e)
                   {
                	   Assert.fail();
                   }
	        }       
	        	 @Test(priority=2)
                 public void TestHomePageTitle()
                 {
	        		 Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not matched");
                 }
	        	 
	        	 @AfterTest    
	        	 void closeApp() 
	        	 {
	        	    driver.quit();
	        	 
                 }
	
	
	}	

