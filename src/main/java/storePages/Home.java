package storePages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "nav-header-root")
	WebElement search;

	@FindBy(name = "keywordSearch")
	WebElement keyElement;

	@FindBy(css = "a.link-rail-item.signin-rail-item")
	WebElement signin;

	@FindBy(name = "user.email_address")
	WebElement emailElement;

	@FindBy(xpath = "//*[@id='pw-input']")
	WebElement passElement;

	@FindBy(xpath = "//*[@id='stay-signedin' and @type='checkbox']")
	WebElement checkboxElement;

	@FindBy(xpath = "//button[@id='sign-in' and @class= 'button primary expanded red-signin']")
	WebElement signInButton;

	// @FindBy(xpath = "//*[@id='sign-in' and @type='submit']")
	// WebElement signInButton;

	@FindBy(id = "macys-login-userId")
	WebElement userIdElement;

	public void clicksearchandkeyinput() throws InterruptedException {
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);

		keyElement.clear();
		Thread.sleep(2000);
		keyElement.sendKeys("Mens Shirt");
		Thread.sleep(2000);
		keyElement.click();
		Thread.sleep(2000);
	}

	public void clickuserid() throws InterruptedException {
		userIdElement.click();
		Thread.sleep(2000);
	}

	public void clicksignandemailandpassandsignbutton() throws InterruptedException {
		signin.click();
		Thread.sleep(500);

		emailElement.clear();
		Thread.sleep(1000);
		emailElement.sendKeys("mirzashuvo79@gmail.com");
		emailElement.click();

		passElement.clear();
		Thread.sleep(1000);
		passElement.sendKeys("Mirza2024");
		Thread.sleep(1000);
		passElement.click();

		checkboxElement.isDisplayed();
		Thread.sleep(1000);
		checkboxElement.click();
		Thread.sleep(1000);

		signInButton.isDisplayed();
		Thread.sleep(1000);
		signInButton.click();
		Thread.sleep(1000);

	}
}
