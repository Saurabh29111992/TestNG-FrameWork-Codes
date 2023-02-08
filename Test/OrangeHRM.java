package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;




public class OrangeHRM 
{

        WebDriver driver;
	
	    @Test(priority=1)
	     void openApp() 
	     {
	    	 
	    	WebDriverManager.chromedriver().setup();
	    	 driver = new ChromeDriver();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	 driver.manage().window().maximize();
	     }
	        
	     @Test(priority=2)
	     void loginApp()
	     {
	    	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	    	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	    	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	     
	     }
	     
	      @Test(priority=3)
	      void close()
	      {
	    	  driver.close();
	      }



}
