package day39;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener  implements ITestListener {

	
	public void onTestStart(ITestResult result)
	{
	    System.out.println("on test start...");
	}
	
	public void onTestSuccess(ITestResult result)
	{
	    System.out.println("on test Success...");
	}
	
	public void onTestFailure(ITestResult result)
	{
	    System.out.println("on test Failure...");
	}

	
	public void onTestSkipped(ITestResult result)
	{
	    System.out.println("on test skipped...");
	}
	
	public void onFinish(ITestContext context)
	{
	    System.out.println("on test Finished...");
	}
	

}
