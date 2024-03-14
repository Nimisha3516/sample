package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpdfsite {

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
   public void test() throws AWTException
   {
	 //  driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\NIMISHA\\Documents");
		 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		 
		 fileupload("\"C:\\Users\\NIMISHA\\Documents\\MEDICAL.pdf\"");
		 
   }
   
  public void fileupload(String p) throws AWTException
  {
	  //to copy path to clipboard
	  StringSelection strSelection=new StringSelection(p);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	  //to paste into system window
	  Robot robot=new Robot();
	  robot.delay(3000);
	  
	  
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
  }
	
	
}
