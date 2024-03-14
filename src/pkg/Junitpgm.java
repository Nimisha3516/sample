package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {

	ChromeDriver driver;
	
	@Before
	public void setup() 
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void title()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@Test
		public void content()
		{
			String src=driver.getPageSource();
			if(src.contains("Gmail"))
					{
				System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
			}
	}
	@After
	public void close()
	{
		driver.close();
		//driver.quit();
	}
	

}
