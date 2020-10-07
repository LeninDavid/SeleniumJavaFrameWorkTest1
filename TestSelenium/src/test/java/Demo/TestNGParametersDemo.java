package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	
	@Test
	@Parameters({"MyName"})
	public void test1(@Optional("Default") String name)
	{
		System.out.println("Name is "+ name);
	}
	
	/*@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("I am inside Test 3");
	}*/

	
}
