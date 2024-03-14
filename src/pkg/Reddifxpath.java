package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifxpath {

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
		//driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();//create an account
		//driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("abcd");//fullname
		//driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr/td/img")).click();//rediff.com
		driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr/td/a")).click();//home
	}
}
