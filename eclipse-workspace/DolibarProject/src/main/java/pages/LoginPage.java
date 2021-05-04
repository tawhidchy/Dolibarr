package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import model.LoginModel;

public class LoginPage extends LoginModel {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void clickOnCMP() {
		
		getCMP().click();
		
	}
	public void clickOnProfile() {
		getclickOnProfile().click();
	}
	public void clickOnLogOut() {
		getclickOnLogOut().click();
	}

}
