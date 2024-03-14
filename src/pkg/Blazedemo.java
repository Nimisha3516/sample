package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://blazedemo.com/register");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("nimisha");
		driver.findElement(By.name("company")).sendKeys("NCS");
		driver.findElement(By.name("email")).sendKeys("nimisha.r7");
		driver.findElement(By.name("password")).sendKeys("nimisha123");
		driver.findElement(By.name("password_confirmation")).sendKeys("nimisha");
		
		
		
	}
	@After
	public void close()
	{
		driver.close();
	}
	
}
