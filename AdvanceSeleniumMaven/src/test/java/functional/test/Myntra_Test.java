package functional.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra_Test {
	@Test
	public void openMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.quit();
	}
}
