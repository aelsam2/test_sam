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
    
	public static void main(String[] args) throws IOException {
		getRowCount();
		getRowDataString(0, 0);
		getRowDataNumber(0, 0);
		
	}
	public static void getRowCount() throws IOException {
		
	 
	 int noOfRows= sheet.getPhysicalNumberOfRows();
	 System.out.println(noOfRows);
	}
	public static void getRowDataString(int rowNum, int colNum) throws IOException {
		 
		 String noOfRows= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		 System.out.println(noOfRows);
		}
	public static void getRowDataNumber(int rowNum, int colNum) throws IOException {
		 
		 double noOfRows= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		 System.out.println(noOfRows);
		}
}
