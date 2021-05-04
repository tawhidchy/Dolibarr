package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import model.CustomerInvoiceModel;

public class CustomerInvoicePage extends CustomerInvoiceModel {

	public CustomerInvoicePage(WebDriver driver) {
		super(driver);

	}

	public void writeRefNoToExcel() {
		String ref = getRefNo();

		System.out.println(ref);
		FileInputStream file = null;
		Sheet sheet = null;
		try {
			file = new FileInputStream("ExcelFile/Book1.xlsx");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Getting sheet1
		sheet = workbook.getSheet("Sheet1");
		Cell c = sheet.getRow(1).getCell(13);
		c.setCellValue(ref);

// Writing changes in Excel file
		try {
			file.close();
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		FileOutputStream outFile = null;
		try {
			outFile = new FileOutputStream(new File("ExcelFile/Book1.xlsx"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			workbook.write(outFile);
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			outFile.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getRefNo() {
		String refsN = getRefText().getText();
		String rText[] = refsN.split("\n");
		String acctText = rText[0];
		System.out.println(acctText);
		return acctText;
	}

}
