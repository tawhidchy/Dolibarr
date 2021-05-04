package model;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel {

	protected WebDriver driver;
	
	public BaseModel(WebDriver driver) {
		this.driver=driver;
		
	}
public void keyBoardEnter() {
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
}

}
