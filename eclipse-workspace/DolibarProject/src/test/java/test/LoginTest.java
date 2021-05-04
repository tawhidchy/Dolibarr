package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void dolibarTest() {
		
		getDolibarPage();
		loginpage.clickOnCMP();
		loginpage.clickOnLgin().click();
		
		
	}

}
