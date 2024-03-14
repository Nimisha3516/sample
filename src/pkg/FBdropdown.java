package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBdropdown {

	
	ChromeDriver driver;
	
	@Before()
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	}
	
	@Test
	public void test()
	{
	WebElement day	=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select d=new Select(day);
		d.selectByValue("1");
		List<WebElement> l = d.getOptions();
		System.out.println(l.size());
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select m=new Select(month);
		m.selectByIndex(3);
		List<WebElement> s = m.getOptions();
		System.out.println(s.size());
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y=new Select(year);
		y.selectByVisibleText("2021");
		List<WebElement> z = y.getOptions();
		System.out.println(z.size());
		
		
	    
		
		
	}
	
}
