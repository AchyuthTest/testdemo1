package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
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
	@Test
	public void mousehover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement electronices_ele1= driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]"));
		WebElement motors_ele2 = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[4]/a[1]"));
		WebElement fashion_ele3 = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Fashion')]"));
		Actions action = new Actions(driver);
		action.moveToElement(electronices_ele1).perform();
		Thread.sleep(3000);
		action.moveToElement(motors_ele2).perform();
		Thread.sleep(3000);
		action.moveToElement(fashion_ele3).perform();
		}
	
	@AfterTest
	public void tear() {
        driver.close();
	}

}
