package com.testyantra.demowebshop.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It will help us to read testcase specific data from excel sheet
 * @author Pooja TS
 */
public class ExcelUtility {
	
	/**
	 * It will help us to read the cell data in the form of String
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return StringData
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readStringData(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testcasespecificdata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		String cellStringData = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		workBook.close();
		return cellStringData;
	}
	
	
	/**
	 * It will help us to read the numeric cell data
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readNumericData(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testcasespecificdata.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		double cellNumericDataa = workBook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		long cellNumericData = (long)cellNumericDataa;
		String cellData = String.valueOf(cellNumericData);
		workBook.close();
		return cellData;
	}

}
