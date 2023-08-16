package day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public abstract class abs {
	public void m1Test() {
		  Object hbch = null;
		  SoftAssert s1 = new SoftAssert();
		  s1.assertEquals(null,hbch);
		  System.out.println("bbb");
	  }
	
	abstract void m2();
	
	@Test
    public void geekforgeeks() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
        String actualRersult=driver.getTitle();
      
        String expectedResult="GeeksforGeeks | A computer science portal for geeks";
        Assert.assertEquals(actualRersult, expectedResult);
  
        driver.close();      
    }
}
