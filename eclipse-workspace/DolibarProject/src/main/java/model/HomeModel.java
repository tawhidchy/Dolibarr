package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {

	public HomeModel(WebDriver driver) {
		super(driver);
		
	}
	
public WebElement getBilling() {
	
		
		WebElement element=driver.findElement(By.xpath("//a[@id='mainmenua_billing']"));
		
		
		return element;
	}

}
