package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPageModel extends HomeModel{
	public ListPageModel(WebDriver driver) {
		super(driver);
		
	}
	

	
public WebElement getVerifyName() {
		
		WebElement verifyName=driver.findElement(By.xpath("(//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']/child::div/child::a)[2]"));
		return verifyName;
		
	}
	public WebElement getVerifyProject() {
		WebElement verifyProject=driver.findElement(By.xpath("//a[text()='000 Interfor']"));
		return verifyProject;
	}
	public WebElement getVerifyProjectType() {
		WebElement type=driver.findElement(By.xpath("//span[text()='Standard invoice']"));
		return type;
	}
	public WebElement getVerifyDate() {
		WebElement date=driver.findElement(By.xpath("(//span[text()='05/03/2021'])[1]"));
		return date;
	}
	public WebElement getVerifyTerms() {
		WebElement terms=driver.findElement(By.xpath("//td[text()='Order']"));
		return terms;
		
	}
	public WebElement getVerifyPaymentDueDate() {
		WebElement dueDate=driver.findElement(By.xpath("(//span[text()='05/03/2021'])[2]"));
		return dueDate;
	}
	public WebElement getVerifyPaymentType() {
		WebElement pType=driver.findElement(By.xpath("//td[text()='Cash']"));
		return pType;
	}
	public WebElement getVerifyCurrency() {
		WebElement currency=driver.findElement(By.xpath("//td[text()='USD - US Dollars']"));
		return currency;
	}
	public WebElement getVerifyBankAccount() {
		WebElement bankAC=driver.findElement(By.xpath("//a[text()='999999889']"));
		return bankAC;
	}
	public WebElement getVerifyExtra() {
		WebElement extra=driver.findElement(By.xpath("//td[@id='facture_extras_extra_6463']"));
		return extra;
		
	}
	public WebElement getProjectText1() {
	WebElement getPtext=driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));

	return getPtext;
	}


}
