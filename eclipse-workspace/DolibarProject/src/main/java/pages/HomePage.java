package pages;

import org.openqa.selenium.WebDriver;

import model.HomeModel;

public class HomePage extends HomeModel{
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	public void clickOnBilling() {
		
		getBilling().click();
		
		
		
	}

}
