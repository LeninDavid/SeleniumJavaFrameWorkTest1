package Listeners;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListeners.class)
public class TestNGListenerDemo2 {

	@Test
	public void Test4()
	{
		System.out.println("I am Inside Test 4");
	}
	
	@Test
	public void Test5()
	{
		System.out.println("I am Inside Test 5");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void Test6()
	{
		System.out.println("I am Inside Test 6");
		//throw new SkipException("This method si skipped");
	}
	
}
