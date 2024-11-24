package storepagetester;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import storeutil.CommonClass;

public class HomeTester extends CommonClass {

	@Test
	public void clickLogoTest() throws InterruptedException {
		home.clicksearchandkeyinput();
	}

	@Test
	public void clickuserId() throws InterruptedException {
		home.clickuserid();
	}

	@Test
	public void clicksignandemailandpassandsignbutton() throws InterruptedException {
		home.clicksignandemailandpassandsignbutton();

	}

}
