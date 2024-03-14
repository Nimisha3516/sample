package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitfileupload {

ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlopen()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
   @Test
   public void test() throws IOException, Exception
   {
	 //  driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\NIMISHA\\Documents");
		 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		 
		 Runtime.getRuntime().exec("\"C:\\Users\\NIMISHA\\Documents\\pdfdownload.exe\"");
		 Thread.sleep(2000);
}
}
