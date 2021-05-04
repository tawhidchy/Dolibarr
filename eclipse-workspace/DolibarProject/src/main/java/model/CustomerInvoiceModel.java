package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerInvoiceModel extends BaseModel {
	public CustomerInvoiceModel(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getRefText() {
		WebElement refNo=driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));

		return refNo;
	}
	


}
