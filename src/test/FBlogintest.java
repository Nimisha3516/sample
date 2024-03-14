package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.FBloginpage;

public class FBlogintest {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	
	{
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.login();
				
	}
	
}
