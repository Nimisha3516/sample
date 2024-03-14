package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Datadrivenframeworkpage {

	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Datadrivenframeworkpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setbvalues(String email,String password)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(fblogin).sendKeys(Keys.ENTER);;
	}
	
}
