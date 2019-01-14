package my_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		//explicit time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_j")).sendKeys("test1");
		driver.findElement(By.id("u_0_l")).sendKeys("V");
		driver.findElement(By.name("reg_email__")).sendKeys("test1@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abacd");		
		driver.findElement(By.name("websubmit")).click();
	}
}
