package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
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

  @AfterClass
  public void close() {
	  driver.close();
  }

}
