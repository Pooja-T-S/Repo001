package testyantra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcel("testdata");
	}

	public static Object[][] readExcel(String sheetName) throws EncryptedDocumentException, IOException {
		File file = new File("./src/test/resources/sample.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet(sheetName);
		
//		int lastRow = sheet.getLastRowNum();
//		short lastCell = sheet.getRow(0).getLastCellNum();
//		System.out.println("Last row index : " + lastRow);
//		System.out.println("Last cell index : " +  lastCell);
//		for(int i=0;i<=lastRow;i++) {
//			for(int j=0;j<lastCell;j++) {
//			String cellData = sheet.getRow(i).getCell(j).toString();
//			System.out.println(cellData);
//		}
//		}
		
		// OR
		
		int row_count = sheet.getPhysicalNumberOfRows();
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[row_count-1][col_count];
		System.out.println(data.length);
		System.out.println("Total no. of rows : " + row_count);
		System.out.println("Total no. of cells : " + col_count);
		for(int i=1;i<row_count;i++) {
			for(int j=0;j<col_count;j++) {
			data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			//System.out.println(cellData);
		}
		}
		for(int i=0;i<row_count-1;i++) {
			for(int j=0;j<col_count;j++) {
				System.out.println(data[i][j]);
			}
		}
		
		workBook.close();
		return data;
		
		
	}

}
