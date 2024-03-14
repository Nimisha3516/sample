package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBXpathContains {
	
	ChromeDriver driver;
	
	@Before()
	public void setup()
	{
	   driver =new ChromeDriver();
	   driver.get("https://www.facebook.com");
	}
	
	@Test()
	public void test()
	{
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();	
	}
	

}
