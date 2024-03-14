package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
//		
//		//to handle google chrome broswer issue
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver=new ChromeDriver(options);
		
//		//To handle notifications
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable notifications");
//		driver=new ChromeDriver(options);
		
		driver.get("file:///D:/alertnew.html");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver .switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abc123");
	}
}
