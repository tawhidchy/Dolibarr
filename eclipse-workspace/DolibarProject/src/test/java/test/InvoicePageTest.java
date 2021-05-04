package test;

import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.InvoiceModel;

public class InvoicePageTest extends BaseTest {

	@Test(dataProvider = "dp")
	public void verifyInvoiceCreeation(String Customer, String Type, String Invoicedate, String PaymentTerms,
			String paymentType, String Bankaccount, String Project, String Extra, String Doctemplate, String Currency,
			String Note, String PNote,String Ref,String value) throws InterruptedException, IOException {



		gethomePage();
		homepage.clickOnBilling();

		getBillingPage();
		billingpage.clickOnInvoice();

	
		
		getInvoicePage();

		
		
		invoicepage.selectTextBox(Customer);
		invoicepage.selectType(Type);
		invoicepage.selectDay(Invoicedate);
		invoicepage.seletermsTextBox(PaymentTerms);
		invoicepage.selectPaymentTypeTextBox(paymentType);
		invoicepage.selectBankAccountTextbox(Bankaccount);
		invoicepage.selectProjecttextBox(Project);
		invoicepage.selectExtra(Extra);
		invoicepage.selectDocTamplateTextBox(Doctemplate);
		invoicepage.selectCurrencyTextBox(Currency);
		invoicepage.writeOnPublicNote(Note);
		invoicepage.writeOnPrivateNote(PNote);
		invoicepage.clickOnCreateDraft();
		//invoicepage.getRefNo();
		getCustomerInvoicePage();
		cip.writeRefNoToExcel();
		
	}

	@DataProvider(name = "dp")
	public Object[][] dataFeeder() throws IOException {

		String filename = "ExcelFile/Book1.xlsx";
		String sheetname = "Sheet1";

		Object[][] t = ExcelRead.excelToArray(filename, sheetname);

		return t;
	}
	
	
}
