package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	
	@Override
	public void onStart(ITestContext Result)
	{
		
		System.out.println("On Start Method Invoked....");
	}

	@Override
	public void onFinish(ITestContext Result)
	{
		
		System.out.println("On Finish Method Invoked....");
	}

	
	//When Test case gets failed, this method is called
	@Override
	public void onTestFailure(ITestResult Result)
	{
		
		System.out.println("Name of the test method failed : " +Result.getName());
	}


    //When Test case get skipped,this method is called
	@Override
	public void onTestSkipped(ITestResult Result)
	{
		
		System.out.println("Name of the test method skipped : " +Result.getName());
	}


	//When Test case get Started,this method is called
	@Override
	public void onTestStart(ITestResult Result)
	{
		
		System.out.println("Name of the test method started : " +Result.getName());
	}
   
	
	//When Test case get Success,this method is called
	@Override
	public void onTestSuccess(ITestResult Result)
    {
			
			System.out.println("Name of the test method sucessful : " +Result.getName());
	}
	
	

	public void onTestSuccessButWithinPercentage(ITestResult Result)
    {
			
			System.out.println("Name of the test method sucessful : " +Result.getName());
	}
	


}
