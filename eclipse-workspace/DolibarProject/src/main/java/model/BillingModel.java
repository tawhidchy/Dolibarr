package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingModel extends BaseModel {

	public BillingModel(WebDriver driver) {
		super(driver);
		
	}
	
public WebElement getInvoice() {
	
		
		WebElement element=driver.findElement(By.xpath("(//a[@class='vsmenu'])[1]"));
		
		
		return element;
	}
public WebElement getInvoiceAfterSearch() {
	WebElement clickInvoiceAfterSearch=driver.findElement(By.xpath("//td[@class='nobordernopadding nowraponall']"));
	return clickInvoiceAfterSearch;
}
public WebElement getList() {
	WebElement clicklist=driver.findElement(By.xpath("(//a[text()='List'])[1]"));
	
	return clicklist;
}
public WebElement getRefTextBox() {
	
	WebElement refBox=driver.findElement(By.xpath("//input[@name='search_ref']"));
	return refBox;
}
public WebElement getSearchButton() {
	WebElement clickSrcButton=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	
	return clickSrcButton;
}


}
