package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateListPageTest extends BaseTest {

	@Test(dataProvider = "dp")
	public void verifyList(String Customer, String Type, String Invoicedate, String PaymentTerms, String paymentType,
			String Bankaccount, String Project, String Extra, String Doctemplate, String Currency, String Note,
			String PNote, String Ref,String value) throws IOException {

		gethomePage();

		homepage.clickOnBilling();
		getBillingPage();

		billingpage.clickOnList();
		billingpage.clickONrefbox();
		billingpage.WriteOnRefBox(Ref);
		billingpage.clickOnSearchButton();
		
		billingpage.clickOnSearchInvoice();



		
		 //getInvoicePage();
		 getListPage();
		listpage.verifyName(Customer);
		listpage.getProjecttext(Project);
		listpage.verifyType(Type);
		listpage.verifyDate(Invoicedate);
		listpage.verifyTerms(PaymentTerms);
		listpage.verifyDueDate(Invoicedate);
		listpage.verifyPaymentType(paymentType);
		listpage.verifyCurrency(Currency);
		listpage.verifyBAnkAccount(Bankaccount);
		listpage.verifyExtra(Extra);
		//invoicepage.getRefNo();
		//writeExcel();
	}

	@DataProvider(name = "dp")
	public Object[][] dataFeeder() throws IOException {

		String filename = "excelFile/Book1.xlsx";
		String sheetname = "Sheet1";

		Object[][] t = ExcelRead.excelToArray(filename, sheetname);

		return t;
	}
	

}
