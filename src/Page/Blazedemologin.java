package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemologin {

	WebDriver driver;
	
	By regname=By.id("name");
	By regcompany=By.id("company");
	By regemail=By.id("email");
	By regpassword=By.id("password");
	By regcnfrmpassword=By.id("password-confirm");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By loginemail=By.xpath("//*[@id=\"email\"]");
	By loginpassword=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public Blazedemologin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String password,String cnfrmpassword)
	
	{
		driver.findElement(regname).sendKeys(name);
		driver.findElement(regcompany).sendKeys(company);
		driver.findElement(regemail).sendKeys(email);
		driver.findElement(regpassword).sendKeys(password);
		driver.findElement(regcnfrmpassword).sendKeys(cnfrmpassword);
	}
	 
	public void register()
	{
		driver.findElement(register).click();
		//driver.navigate().back();
	}
	
	public void putvalues(String mail,String paswrd)
	{
		driver.findElement(loginemail).sendKeys(mail);
		driver.findElement(loginpassword).sendKeys(paswrd);
	}
	
	public void logim()
	{
		driver.findElement(login).click();
	}
	
}
