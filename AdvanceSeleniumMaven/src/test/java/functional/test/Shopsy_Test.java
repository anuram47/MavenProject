package functional.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shopsy_Test {

	@Test
	public void openShopsy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopsy.in/");
		driver.quit();
	}
}
