package testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickinspect {
   
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
   @Test
   public void tets()
   {
	
	 WebElement w = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	 Actions obj=new Actions(driver);
	 obj.contextClick(w);
	 obj.perform();
	   driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	   driver.switchTo().alert().accept();
//		String S=a.getText();
//		if (S.equals("demo.guru99.com says"))
//				{
//	System.out.println("pass");
//				}
//		else
//		{
//			System.out.println("fail");
//		}
//		a.accept();
	   
	   WebElement e = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	   obj.doubleClick(e);
	   obj.perform();
	   driver.switchTo().alert().accept();
   }
  
}
