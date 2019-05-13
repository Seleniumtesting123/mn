package RAHIL.ATTUNE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Sample {

	
	
	
	
	
	
	WebDriver driver ;
	
	@Test
	
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("mohdrahil2989@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
	
	}
	
  
}
