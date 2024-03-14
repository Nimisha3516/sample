package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFB {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/div/div/form/div[1]/div/input")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
