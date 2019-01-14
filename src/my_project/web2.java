package my_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class web2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/imghp?hl=en&tab=wi'"));
		//implicite time
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();

	}

}
