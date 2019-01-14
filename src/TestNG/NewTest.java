package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void verifytitle() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x, x);
	  
  }
  @Test
  public void verifyurl() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x, "edureka.co");
	  
  }
  
}
