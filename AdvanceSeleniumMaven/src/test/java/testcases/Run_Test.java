package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_Test {

	@Test
	public void launch() throws InterruptedException {
		String url = System.getProperty("url");
		System.out.println("------------------test");
		Reporter.log("url is = = "+url, true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(url);
		Thread.sleep(2000);
		driver.quit();
	}
}
