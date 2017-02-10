package advanceTopics;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadLibrary {
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	public ExcelReadLibrary(String xlpath) {
		
		try {
			File src  = new File(xlpath);
		
			FileInputStream is = new FileInputStream(src);
		
			wb = new XSSFWorkbook(is);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}}
		public String getData(int sheetnumber, int rownumber, int colnumber){
			
			sh1 = wb.getSheetAt(sheetnumber);
			String data = sh1.getRow(rownumber).getCell(colnumber).getStringCellValue();
			return data;
		}
		public int numberofRows(int sheetIndex){
			int rows = wb.getSheetAt(sheetIndex).getLastRowNum();
			rows = rows+1;
			
			return rows;
		}
		public int numberofCol(int sheetIndex){
			int cols = wb.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
			//cols = cols+1;
			return cols;
		}
		
		
		
	}


