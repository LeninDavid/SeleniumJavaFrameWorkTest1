package Demo;

import org.testng.annotations.Test;

@Test(groups = {"All Class Test"})
public class TestNGGroups {

	
	@Test(groups = {"windows.sanity"})
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	
	@Test(groups = {"windows.regression"})
	public void test2()
	{
		System.out.println("I am inside Test 2");
	}
	
	@Test(groups = {"linux.regression"})
	public void test3()
	{
		System.out.println("I am inside Test 3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("I am inside Test 4");
	}

}
