package functional.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho_Test {

	@Test
	public void openMeesho() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}
}
