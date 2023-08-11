package day9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenertest extends tutorial2 implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result){
		//System.out.println("failed " + result.getName()+" method" ); 
		System.out.println("onTestFailure method");
		System.out.println("onTestFailure driver = "+driver);
		try {
			FileOutputStream  des = new FileOutputStream("E:\\Practice\\screenshotslive\\6120223\\"+result.getName()+".png");
			System.out.println("filecreated des");
			File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println("temporary file scr is done");
     		FileUtils.copyFile(scr, des);
		} catch (NullPointerException | IOException e) {
			System.out.println("We are getting NullpointerException here");
		}
//		FileOutputStream  des = new FileOutputStream("E:\\Practice\\screenshotslive\\6120223\\"+result.getName()+".jpg");
//		File des=new File("E:\\Practice\\screenshotslive\\6120223\\"+result.getName()+".jpg");
//		try {
//			FileUtils.copyFile(scrfile, des);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started "+result.getName()+" just now");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Method Passed successfully");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getTestName()+" Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getTestName()+" Test SuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getTestName()+" Test SuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+" Excecution Started ");
		System.out.println("=========================");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" Execution  Finished");
	}


}
