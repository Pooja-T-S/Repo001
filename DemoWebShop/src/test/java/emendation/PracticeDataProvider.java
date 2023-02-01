package emendation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class PracticeDataProvider {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readDataFromExcel("testdata");
	}
	
	//@DataProvider(name = "testdataa")
	public static Object[][] readDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/sample.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		int row_count = sheet.getPhysicalNumberOfRows();
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row_count);
		System.out.println(col_count);
		Object[][] data = new Object[row_count-1][col_count];
		System.out.println(data.length);
		for(int i=1;i<row_count;i++) {
			for(int j=0;j<col_count;j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<row_count-1;i++) {
			for(int j=0;j<col_count;j++) {
				System.out.println(data[i][j]);
			}
		}
		
		return data;
		
	}

}
