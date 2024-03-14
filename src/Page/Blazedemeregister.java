package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemeregister {

	WebDriver driver;
	
	By log=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By loginemail=By.xpath("//*[@id=\"email\"]");
	By loginpassword=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	By rember=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	public Blazedemeregister(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void putvalues(String mail,String paswrd)
	{
		driver.findElement(log).click();
 	driver.findElement(loginemail).sendKeys(mail);
	driver.findElement(loginpassword).sendKeys(paswrd);
    }
	
	public void logim()
	{
		//driver.findElement(login).click();
		driver.findElement(rember).click();
		driver.findElement(login).click();
	}
	
}
