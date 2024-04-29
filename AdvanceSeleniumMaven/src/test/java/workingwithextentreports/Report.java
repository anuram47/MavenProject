package workingwithextentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.UtilityMethods;

public class Report {
	WebDriver driver;

	@Test
	public void toGetExtentReports() {
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter extentSparkReporterObj = new ExtentSparkReporter("./Exentreports/"+UtilityMethods.getCurrentTime()+".html");
		extentReports.attachReporter(extentSparkReporterObj);
		ExtentTest extentTestObj = extentReports.createTest("login");

		UtilityMethods um = new UtilityMethods();
		driver = new ChromeDriver();
		extentTestObj.log(Status.INFO, "Web browser is opened successfully.");
		driver.manage().window().maximize();
		extentTestObj.log(Status.INFO, "Web browser is maximized.");
		driver.get("https://in.via.com/");
		extentTestObj.log(Status.INFO, "Via.com website is opened.");
		driver.findElement(By.id("wzrk-cancel")).click();
		extentTestObj.log(Status.INFO, "Clicking on No Thanks button.");
		driver.findElement(By.id("SignIn")).click();
		extentTestObj.log(Status.INFO, "Clicking on Signin option.");
		driver.findElement(By.id("loginIdText")).sendKeys("anuram47@gmail.com");
		extentTestObj.log(Status.INFO, "Provided email id to login.");
		driver.findElement(By.id("passwordText")).sendKeys("Anuram@47");
		extentTestObj.log(Status.INFO, "provided password to login.");
		driver.findElement(By.id("loginValidate")).click();
		extentTestObj.log(Status.INFO, "Clicking on Signin to login to application.");
		
		try {
			if(driver.findElement(By.id("userNameSecondaryNav")).isDisplayed()) {
				extentTestObj.log(Status.PASS, "User is able to login successully.");
				extentTestObj.pass(MediaEntityBuilder.createScreenCaptureFromPath(um.takeSreenShot(driver)).build());
			}
		}catch (Exception e) {
			extentTestObj.fail(MediaEntityBuilder.createScreenCaptureFromPath(um.takeSreenShot(driver)).build());
		}
		extentReports.flush();
		driver.quit();
	}

}
