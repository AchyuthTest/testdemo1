package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class twq {
	
	WebDriver driver;
	ChromeOptions option;
    
	@Test
	public void test1() throws Exception {
		WebDriverManager.chromedriver().setup();
		option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("E:\\AutoIT_Files\\auscript1.exe");
		Thread.sleep(15000);
		driver.quit();
	}

}
