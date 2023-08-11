package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class tutorial extends tutorial2{
   
	@Test(priority=1)
	public void m1() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.findElement(By.name("q")).sendKeys("srisailam");	
		driver.findElement(By.name("q")).click();
		driver.close();
	}
	
	@Test(priority=2)
	public void m2() throws Exception {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("alampur");
		driver.findElement(By.name("p")).click();
		driver.close();
	}
	
	@Test(priority=3)
	public void m3() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.findElement(By.name("q")).sendKeys("Mahanandi");	
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String Actual_Result= driver.getTitle();
		System.out.println("m3 driver value = " +driver);
		Assert.assertEquals(Actual_Result, "Mahanandi");
		driver.close();
		
	}
	
}
