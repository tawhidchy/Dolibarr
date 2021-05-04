package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import model.InvoiceModel;

public class InvoicePage extends InvoiceModel {

	public InvoicePage(WebDriver driver) {
		super(driver);

	}

	public void selectTextBox(String text) {
		getCustomer().click();
		getCustomerTextBox().sendKeys(text);
		keyBoardEnter();
	}

	public void selectType(String type) {
		getType().click();
	}

	public void selectDay(String date) {
		getInvoiceDate().click();
		getdateTextBox().sendKeys(date);
		keyBoardEnter();
	}

	public void seletermsTextBox(String text) {
		getpaymentTerms().click();
		getPaymentTermsTextBox().sendKeys(text);
		keyBoardEnter();

	}

	public void selectPaymentTypeTextBox(String text) {
		getpaymentType().click();
		getPaymentTypeTextBox().sendKeys(text);
		keyBoardEnter();
	}

	public void selectBankAccountTextbox(String text) {
		getbankAccount().click();
		getBankAccountTextBox().sendKeys(text);
		keyBoardEnter();
	}

	public void selectProjecttextBox(String text) {
		getProject().click();
		projectTextBox().sendKeys(text);
		keyBoardEnter();

	}

	public void selectExtra(String extra) {
		// getExtra().click();
		getExtra().sendKeys(extra);

	}

	public void selectDocTamplateTextBox(String text) {
		getDocTemplate().click();
		docTamplateTextBox().sendKeys(text);
		keyBoardEnter();
	}

	public void selectCurrencyTextBox(String text) {
		// new Actions(driver).click(getCurrency()).perform();
		getCurrency().click();

		currencyTextBox().sendKeys(text);

		keyBoardEnter();
	}

	public void writeOnPublicNote(String noteTypePublic) {

		getPublicNote().sendKeys(noteTypePublic);
		driver.switchTo().defaultContent();

	}

	public void writeOnPrivateNote(String noteTypePrivate) {

		getPrivateNote().sendKeys(noteTypePrivate);
		driver.switchTo().defaultContent();

	}

	public void clickOnCreateDraft() {
		getCreateDraft().click();
	}
	
	public void verifyName(String ExpName) {
	String actName	=getVerifyName().getText();
	Assert.assertEquals(actName, ExpName);
	
	}
	public void verifyProject(String Expname) {
		String actName=getVerifyProject().getText();
		Assert.assertEquals(actName, Expname);
		
		
	}
	public void verifyType(String Exptype) {
		String actType=getVerifyProjectType().getText();
		Assert.assertEquals(actType, Exptype);
	}
	public void verifyDate(String ExpDate) {
		String actDate=getVerifyDate().getText();
		Assert.assertEquals(actDate, ExpDate);
	}
	public void verifyTerms(String ExpTerms) {
		String actTerms= getVerifyTerms().getText();
		Assert.assertEquals(actTerms, ExpTerms);
		
	}
	public void verifyDueDate(String ExpDate) {
		String acctDate=getVerifyPaymentDueDate().getText();
		Assert.assertEquals(acctDate, ExpDate);
		
	}
	public void verifyPaymentType(String ExpType) {
		String acctPType=getVerifyPaymentType().getText();
		Assert.assertEquals(acctPType, ExpType);
	}
	public void verifyCurrency(String ExpCurrency) {
		String acctCurrency=getVerifyCurrency().getText();
		Assert.assertEquals(acctCurrency, ExpCurrency);
	}
	
	public void verifyBAnkAccount(String ExpAC) {
		String acctAccount=getVerifyBankAccount().getText();
		Assert.assertEquals(acctAccount, ExpAC);
	}
	public void verifyExtra(String ExpExtra) {
		String acctExtra=getVerifyExtra().getText();
		Assert.assertEquals(acctExtra, ExpExtra);
	}
	
	public String getProjecttext(String Expproject) {
		String text=getProjectText1().getText();
		String p []=text.split("\n");
		String acctProject=p[3].split(" : ")[1];
		Assert.assertEquals(acctProject, Expproject);
		return acctProject;
	}
	

}
