package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static Common com = new Common();
	static String projPath=com.projectPath();
	static XSSFWorkbook workBook;
	static XSSFSheet sheet ;
	public ExcelUtil(String file, String sheetName) throws IOException {
		workBook = new XSSFWorkbook(projPath+file);
		sheet = workBook.getSheet(sheetName);
	}
	
	public  int getRowCount() throws IOException {
		
		int noOfRows= sheet.getPhysicalNumberOfRows();
		return noOfRows;
	}
	
	public  int getColumnCount() throws IOException {

		int noOfCol= sheet.getRow(0).getPhysicalNumberOfCells();
		return noOfCol;
	}
	
	public  String getRowDataString(int rowNum, int colNum) throws IOException {

		String StringData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return StringData;
	}
	
	public  double getRowDataNumber(int rowNum, int colNum) throws IOException {

		double numberData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return numberData;
	}
}
