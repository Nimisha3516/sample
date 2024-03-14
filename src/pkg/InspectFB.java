package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectFB {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("itsmenimisha.r7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nimisha@3516");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void close()
	{
		driver.close();
	}
}
