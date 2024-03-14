package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcreateaccnt {

	
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		 WebElement w = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		 String S=w.getAttribute("value");
		 
			if(S.equals("Create my account >>"))
			{
				System.out.println("pass");
			}
			
			else
			{
				System.out.println("fail");
			}
		}
	}

