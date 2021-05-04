package test;

import org.testng.annotations.Test;

public class BillingPageTest extends BaseTest{
	
	
	@Test
	public void billingPageTest() {
		
		getDolibarPage();
		loginpage.clickOnCMP();
		loginpage.clickOnLgin().click();
		
		gethomePage();
		homepage.clickOnBilling();
		
		getBillingPage();
		billingpage.clickOnInvoice();
		
		
		
	}

}
