package test;

import org.testng.annotations.Test;

import Page.Datadrivenframeworkpage;
import baseclass.Base;
import utilities.Utility;

public class Pagedrivenframeworktest extends Base
{
	
	@Test
	public void verifyLoginWithValidCred()
	{
		Datadrivenframeworkpage p1=new Datadrivenframeworkpage(driver);
		
		//Read the data from excel file
		
		String x1="C:\\Users\\NIMISHA\\Documents\\testexcel.xlsx";
				
				String Sheet="Sheet1";
		
		int rowCount=Utility.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Username=Utility.getCellValue(x1, Sheet, i, 0);
			System.out.println("username----" +Username);
			String Pwd=Utility.getCellValue(x1, Sheet, i, 1);
			System.out.println("password----" +Pwd);
			
			p1.setbvalues(Username, Pwd);
			p1.login();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
