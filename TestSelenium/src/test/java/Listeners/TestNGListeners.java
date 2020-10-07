package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void	onFinish(ITestContext context)
	{
		System.out.println("Test Finished"+ context.getName());
	}
	//Invoked after all the tests have run and all their Configuration methods have been called.
	public void	onStart(ITestContext context)
	{
		
	}
	//Invoked after the test class is instantiated and before any configuration method is called.
	public void	onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	//Invoked each time a method fails but has been annotated with successPercentage and this failure still keeps it within the success percentage requested.
	public void	onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed"+ result.getName());
	}
	//Invoked each time a test fails.
	public void	onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped"+ result.getName());
	}
	//Invoked each time a test is skipped.
	public void	onTestStart(ITestResult result)
	{
		System.out.println("Test Started"+ result.getName());
	}
	//Invoked each time before a test will be invoked.
	public void	onTestSuccess(ITestResult result)
	{
		System.out.println("Test is successful"+ result.getName());
	}
	//Invoked each time a test succeeds.
}
