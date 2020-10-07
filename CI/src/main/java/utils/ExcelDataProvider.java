package utils;

import java.io.IOException;


public class ExcelDataProvider {

	public  Object[][] testData(String excelPath, String excelSheet) throws IOException {
		
		ExcelUtil excel = new ExcelUtil(excelPath, excelSheet);
		int rowCount=	excel.getRowCount();
		int colCount =excel.getColumnCount();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData=excel.getRowDataString(i, j);
				System.out.println(cellData);
				data[i-1][j]=cellData;
			}
		}
		return data;
	}
}

