package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	
	
	@Test
	public void homePageTest() {
		getDolibarPage();
		loginpage.clickOnCMP();
		loginpage.clickOnLgin().click();
		
		gethomePage();
		homepage.clickOnBilling();
	}

}
