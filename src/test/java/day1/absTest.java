package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class absTest {
	WebDriver driver;
	ChromeOptions option;
	
	@BeforeTest
	public void max() {
		WebDriverManager.chromedriver().setup();
		  option = new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(option);
	      driver.manage().window().maximize();
	}
	
  @Test
  public void m1Test() {
	  Object hbch = null;
	  SoftAssert s1 = new SoftAssert();
	  s1.assertEquals(null,hbch);
  }

  @Test
  public void m2Test() {
    System.out.println("s");  }
  
  @Test
  public void geekforgeeks() {
      driver.get("https://www.geeksforgeeks.org/");
      String actualRersult=driver.getTitle();
    
      String expectedResult="GeeksforGeeks | A computer science portal for geeks";
      Assert.assertEquals(actualRersult, expectedResult);

      driver.close();      
  }
}
