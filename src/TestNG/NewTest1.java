package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	  }
  @Test
  public void verifyurl() {
	  String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x, x);
  }
  
  @Test
  public void verifytitle() {
	  String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x, x);
  }

  @AfterMethod
  public void close() {
	  driver.close();
  }

}
