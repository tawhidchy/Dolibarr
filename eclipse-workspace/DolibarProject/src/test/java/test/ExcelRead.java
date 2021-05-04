package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static Object[][] excelToArray(String filename,String sheetname) throws IOException {

		Object[][] t;

		FileInputStream fis = new FileInputStream(filename);
		//Workbook wb = new HSSFWorkbook(fis);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet(sheetname);

		int numberOfRows = sh.getPhysicalNumberOfRows();
		int numberOfCol = sh.getRow(0).getPhysicalNumberOfCells();

		t = new Object[numberOfRows - 1][numberOfCol];


		for (int row = 1; row < numberOfRows; row++) {

			for (int col = 0; col < numberOfCol; col++) {

				DataFormatter df = new DataFormatter();
				Cell cell = sh.getRow(row).getCell(col);

				t[row - 1][col] = df.formatCellValue(cell);

			}

		}

		return t;

	}


}
