package storeutil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import storePages.Home;

public class CommonClass {

	public WebDriver driver;
	public Home home;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mizim\\eclipse-workspace\\com.Macys2024\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		home = new Home(driver);
	}

	@AfterMethod
	public void tearUp() {
		//driver.quit();
	}

}
