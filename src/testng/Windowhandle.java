package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	
   @Test
   public void test()
   {
	String parentwindow = driver.getWindowHandle();
	System.out.println("parent window---" +driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	//System.out.println("parent window---" +parentwindow);
	Set<String> childwindow = driver.getWindowHandles();
	
	   
	for(String handle:childwindow)
	{
		//System.out.println(handle);
		
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc123");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			driver.close();
		}
	}
         driver.switchTo().window(parentwindow);
       WebDriver tab = driver.switchTo().newWindow(WindowType.TAB);
    //  WebDriver window = driver.switchTo().newWindow(WindowType.WINDOW);
      driver.get("https://www.google.com");
   }
   
   
}
