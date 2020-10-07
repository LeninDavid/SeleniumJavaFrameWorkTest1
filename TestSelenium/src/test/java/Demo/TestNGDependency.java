package Demo;

//import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TestNGDependency {

	@Test(dependsOnMethods = {"test3"})
	public void test1()
	{
		System.out.println("Inside Test 1 ");
	}
	
	@Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println("Inside Test 2 ");
	}
	
	@Test(dependsOnGroups = {"sanity.*"})
	public void test3()
	{
		System.out.println("Inside Test 3 ");
	}
	
	@Test(groups = {"sanity1"})
	public void test4()
	{
		System.out.println("Inside Test 4 ");
	}
	
	@Test(groups = {"sanity2"})
	public void test5()
	{
		System.out.println("Inside Test 5 ");
	}
}
