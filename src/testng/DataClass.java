package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataClass{

	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void loginVerify() throws IOException
	{
			File f=new File("C:\\Users\\NIMISHA\\Documents\\testexcel.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("Sheet1");
			System.out.println(sh.getLastRowNum());
			
	  for (int i=1;i<=sh.getLastRowNum();i++)
	  {
		  String username=sh.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("username=" +username);
		  String passwd=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("password=" +passwd);
		  driver.findElements(By.xpath("//*[@id=\"email\"]")).clear(); 
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		  driver.findElements(By.xpath("//*[@id=\"pass\"]")).clear(); 
		  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(passwd);
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	  }			
		
	}
		
}
