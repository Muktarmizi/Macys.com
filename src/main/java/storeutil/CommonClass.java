package storeutil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import storePages.Home;
import utils.Configuration;
import static utils.IConstant.*;

public class CommonClass {

	public WebDriver driver;
	public Home home;
    Configuration configuration;
    
	@BeforeMethod
	public void setup() {
		configuration = new Configuration();
		initDrive();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProperties(URL));
		long pageloadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitylyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitylyWait));
		initClass();
	}
	
	public void initDrive() {
		String browserName = configuration.getProperties(BROWSER);
		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mizim\\eclipse-workspace\\com.Macys2024\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		default:
			break;
		}
	}
	
	
	public void initClass() {
		home = new Home(driver);
		
	}
	

	@AfterMethod
	public void tearUp() {
		//driver.quit();
	}

}
