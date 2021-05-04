package pages;

import org.openqa.selenium.WebDriver;

import model.BillingModel;

public class BillingPage extends BillingModel{

	public BillingPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void clickOnList() {
		getList().click();
	}
	public void clickONrefbox() {
		getRefTextBox().click();
	}
	public void WriteOnRefBox(String Text) {
		
		getRefTextBox().sendKeys(Text);
	}
	public void clickOnSearchButton() {
		getSearchButton().click();
	}
	public void clickOnInvoice() {
		getInvoice().click();
		
	}
	public void clickOnSearchInvoice() {
		getInvoiceAfterSearch().click();
	}
	
	
	
	

}
