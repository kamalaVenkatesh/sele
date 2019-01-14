package TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void verifytitle3() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.edureka.com");
		String x = driver.getCurrentUrl();
		System.out.println(x);
  }
}
