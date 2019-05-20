package example2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestingTitle3 {
	WebDriver driver;
	
	@BeforeTest
	public void startDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Avisek\\eclipse-workspace\\WebDriverTest2\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/");
	}
	
	@Test
	public void checkTitle() {
		Assert.assertEquals(driver.getTitle(), "Meet Guru99 - Free Training Tutorials & Video for IT Courses");
	}

	  @AfterTest
	  public void afterTest() {
	  }

}
