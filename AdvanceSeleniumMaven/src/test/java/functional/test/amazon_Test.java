package functional.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon_Test {
	@Test
	public void openAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
