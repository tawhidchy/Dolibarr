package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvoiceModel extends HomeModel {

	public InvoiceModel(WebDriver driver) {
		super(driver);

	}

	public WebElement getCustomer() {

		WebElement customer = driver.findElement(By.xpath("//span[@id='select2-socid-container']"));

		return customer;

	}

	public WebElement getCustomerTextBox() {
		WebElement tBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return tBox;
	}

	public WebElement getType() {

		WebElement type = driver.findElement(By.xpath("//*[@id=\"formtocreate\"]/div[1]/table/tbody/tr[3]/td[2]"));

		return type;

	}

	public WebElement getInvoiceDate() {

		WebElement invoiceDate = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));

		return invoiceDate;

	}

	public WebElement getdateTextBox() {
		WebElement selectDate = driver.findElement(By.xpath("//input[@id='re']"));
		return selectDate;
	}

	public WebElement getpaymentTerms() {

		WebElement pTerms = driver.findElement(By.xpath("//span[@id='select2-cond_reglement_id-container']"));

		return pTerms;

	}

	public WebElement getPaymentTermsTextBox() {
		WebElement termstextBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return termstextBox;
	}

	public WebElement getpaymentType() {

		WebElement pType = driver.findElement(By.xpath("//span[@id='select2-selectmode_reglement_id-container']"));

		return pType;

	}

	public WebElement getPaymentTypeTextBox() {
		WebElement paymentTermstextBox = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return paymentTermstextBox;
	}

	public WebElement getbankAccount() {

		WebElement bAccount = driver.findElement(By.xpath("//span[@id='select2-selectfk_account-container']"));

		return bAccount;

	}

	public WebElement getBankAccountTextBox() {
		WebElement BankAcType = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return BankAcType;
	}

	public WebElement getProject() {

		WebElement project = driver.findElement(By.xpath("//span[@id='select2-projectid-container']"));

		return project;

	}

	public WebElement projectTextBox() {
		WebElement pjtext = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return pjtext;
	}

	public WebElement getExtra() {

		WebElement extra = driver.findElement(By.xpath("//input[@id='options_extra']"));

		return extra;

	}

	public WebElement getDocTemplate() {

		WebElement Dtemplate = driver.findElement(By.xpath("//span[@id='select2-model-container']"));

		return Dtemplate;

	}

	public WebElement docTamplateTextBox() {
		WebElement docTemp = driver.findElement(By.xpath("//input[@aria-controls='select2-model-results']"));
		return docTemp;
	}

	public WebElement getCurrency() {

		WebElement currency = driver.findElement(By.xpath("//td[text()='Currency']/following-sibling::td/span"));

		return currency;

	}

	public WebElement currencyTextBox() {
		WebElement currencytext = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		return currencytext;
	}

	public WebElement getPublicNote() {

		driver.switchTo().frame(0);

		WebElement notePublic = driver.findElement(By.xpath("//body"));

		return notePublic;

	}

	public WebElement getPrivateNote() {

		driver.switchTo().frame(1);

		WebElement notePrivate = driver.findElement(By.xpath("//body"));

		return notePrivate;

	}

	public WebElement getCreateDraft() {

		WebElement createDraft = driver.findElement(By.xpath("//input[@name='bouton']"));

		return createDraft;
	}
	
	
	public WebElement getInvoice() {
		WebElement clickInvoiceElement=driver.findElement(By.xpath("//td[@class='nobordernopadding nowraponall']"));
		return clickInvoiceElement;
	}
	
	public WebElement getVerifyName() {
		
		WebElement verifyName=driver.findElement(By.xpath("//a[text()='Andrea Martiinez']"));
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
	WebElement getPtext=	driver.findElement(By.xpath("//div[@class='inline-block floatleft valignmiddle maxwidth750 marginbottomonly refid refidpadding']"));

	return getPtext;
	}
	
}
