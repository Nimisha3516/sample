package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver .get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("nimishar7@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
		
		}
}
