package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	ChromeDriver driver;
	
	@Before()
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test()
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		
		//to view each links in the list
		
		for(WebElement w:li)
		{
			String S=w.getAttribute("href");
			String T=w.getText();
			System.out.println(S +"---" +T);
		}
	}
}
