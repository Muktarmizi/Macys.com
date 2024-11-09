package storePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//div[@id='nav-header-root']")
	WebElement logoElement;
// will add more Element.
	
	@FindBy (id = "macys-login-userId")
     WebElement userIdElement;
	
     public void clickLogo() {
		logoElement.click();

	}

}
