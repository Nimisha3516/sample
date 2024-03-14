package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Blazedemeregister;
import Page.Blazedemologin;

public class Blazedemotest {

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://blazedemo.com/register");
		
	}
	
	@Test
	public void test()
	{
		Blazedemologin ob=new Blazedemologin(driver);
		ob.setvalues("nimisha", "tcs", "abc@gmail.com", "abc123", "abc123");
		ob.register();
		driver.navigate().back();
		Blazedemeregister ob1=new Blazedemeregister(driver);
		ob1.putvalues("abc@gmai.com", "abc123");
		ob1.logim();
	}
	
}
