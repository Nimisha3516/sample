package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {


		@Before
		public void setup ()
		{
			System.out.println("browser open");
		}
		@Test
		public void test()
		{
			System.out.println("test");
		}
		@After
		public void browserclose()
		{
			System.out.println("browser close");
		}

	

}
