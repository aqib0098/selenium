package Jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class jeken2{
	
	static WebDriver driver;
	@BeforeClass
	public static void invoke()
	{
	System.setProperty("webdriver.gecko.driver", "\\C:\\Users\\Aqib\\Desktop\\geckodriver.exe\\");
	 driver =new FirefoxDriver(); 
	 //System.setProperty("webdriver.gecko.driver", "\\C:\\Users\\Aqib\\Desktop\\geckodriver.exe\\");	
	driver.get("https://www.facebook.com/");
	
	}
	@AfterClass 
	public static void Quite() throws InterruptedException
	{
		//Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
	
	
	
	@Test (priority=3)
	public void tes009() throws InterruptedException
	{
	  
		//System.setProperty("webdriver.gecko.driver", "\\C:\\Users\\Aqib\\Desktop\\geckodriver.exe\\");
		
		 //WebDriver driver = new FirefoxDriver();
	  
	 // driver.get("https://www.facebook.com/");
	 
              //Thread.sleep(1000);	  
		driver.findElement(By.id("email")).sendKeys("ajkdkdnakjn");
		System.out.println("this is third");
	  }
	@Test (priority =4)
	public void test0011()
	{
		
		driver.findElement(By.id("pass")).sendKeys("weqeewr");
		
		
		System.out.println("this is fourth");
	}
	
	
}
