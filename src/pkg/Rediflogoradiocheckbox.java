package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediflogoradiocheckbox {

	ChromeDriver driver;
	
	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
	 WebElement w = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	// driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"))w.isDisplayed();
	 boolean b=w.isDisplayed();
	 
	 if (b==true)//if (w.displayed)
			 {
		 System.out.println("logo is displayed");
			 }
	 else
	 {
		 System.out.println("logo not displayed");
	 }
	 WebElement e = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
	boolean t=e.isSelected();
	
	if (t)
	{
		System.out.println("Check box is selected");
	}
	else
	{
		System.out.println("Checkbox not selected");
	}
	
	WebElement f = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	boolean y=f.isSelected();
	
	if(y==true)
	{
		System.out.println("Radiobutton is selected ");
	}
	else
	{
		System.out.println("Radio button is not selected");
	}
	}
}
