package day9;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class tutorial2 {
		public static WebDriver driver;
	@Test
	public void tc_1(){
//		FileOutputStream  des = new FileOutputStream("E:\\Practice\\screenshotslive\\6120223\\.jpg");
//		des.close();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.findElement(By.name("q")).sendKeys("yaganti");	
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String Actual_title = driver.getTitle();
		String Expected_title = "Near nandyal - Google Search";
		Assert.assertEquals(Actual_title, Expected_title);
		
	}
	
	@AfterTest
	public void bb() throws Exception {
		System.out.println("bb method");
		System.out.println("driver = "+driver);
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileOutputStream  des = new FileOutputStream("E:\\Practice\\screenshotslive\\6120223\\1.jpg");
		FileUtils.copyFile(scr, des);
		driver.close();
	}
 
}
