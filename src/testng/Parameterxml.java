package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterxml {
	
	@Parameters("a")
@Test
public void test(String v)
{
	System.out.println("value is=" +v);
}
	

}
