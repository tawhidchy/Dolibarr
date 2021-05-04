package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModel  extends BaseModel{

	public LoginModel(WebDriver driver) {
		super(driver);
		
	}
public WebElement getCMP() {
	
		
		WebElement element=driver.findElement(By.xpath("//div[text()='Company manufacturing products']"));
		
		
		return element;
	}
	
	public WebElement  clickOnLgin() {
		WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));
		
		return element;
	}
	
	public WebElement getclickOnProfile() {
		WebElement logOut=driver.findElement(By.xpath("//span[text()='David']"));
		return logOut;
	}
	public WebElement getclickOnLogOut() {
		WebElement clickLogout=driver.findElement(By.xpath("(//a[@class='button-top-menu-dropdown'])[2]"));
	return clickLogout;
	}
	
	
	

}
