package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
//		String expectedtitle="Facebook";
//		if(actualtitle.equalsIgnoreCase(expectedtitle))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		String src=driver.getPageSource();
		if(src.contains("Create new account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	

}
