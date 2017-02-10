package advanceTopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadNumericExcel {

	public static void main(String[] args) throws Exception {
				
				File src = new File("./data/testdata.xlsx");
				
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet s1 = wb.getSheetAt(0);
				int rows = s1.getLastRowNum();
				int col = s1.getRow(0).getLastCellNum();
				for (int i=0;i<rows;i++){
					for (int j=0;j<col;j++){
					
				Cell c1 = s1.getRow(i).getCell(j);
				int str = (int) c1.getNumericCellValue();
				System.out.print(str+" ");
				}
					System.out.println();
				}
				
				for (int i=0;i<=rows;i++){
					for (int j = 2;j<3;j++){
						s1.getRow(i).createCell(j).setCellValue("Malik"+i);
					}
				}
				FileOutputStream fos = new FileOutputStream(src);
				wb.write(fos);
				wb.close();
			}
			
			
			



	}


