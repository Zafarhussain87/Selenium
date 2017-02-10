/**
 * 
 */
package advanceTopics;

import java.io.File;
import java.io.IOException;

import jxl.Cell;

//import com.google.common.collect.Table.Cell;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author Zafar Hussain
 * some useful classes and interface, which we will be using
   Workbook (Class) – Will handle workbook.
   Sheet (Interface) – Which will handle sheets
   Cell (Interface) – Which will handle cell  
 */
public class ReadFromExcel {

	public static void main(String[] args) throws  IOException {
		
		File src = new File(".//data//testdata.xls");
		try {
		/*Workbook is a class in Jexcel which will take file as an argument and 
		 * getWorkbook is a predefined method which will read the workbook and will return the workbook object
		 */
			
		Workbook wb =  Workbook.getWorkbook(src);
		/*// Workbook is loaded now we have to load sheet so using workbook object (wb) we
		 *  can call getSheet method which will take index as an argument and will load the sheet, 
		 *  we can also specify the sheet name also
		 */
		Sheet s1 = wb.getSheet(0);
		/*Sheet is loaded then we have to read cell so using sh1 object call getCell method
		 *  which we take two arguments getCell(column,row)
		 */
		for(int i=0;i<2;i++){
			for (int j=0;j<1;j++){
				Cell c1 = s1.getCell(i,j);

				String data = c1.getContents();
				System.out.println("Sheet's data is "+data);
			}
		}
		//to find out how many rows and columns have data. helps in loop for getting the data.
		int r = wb.getSheet(0).getRows();
		int c = wb.getSheet(0).getColumns();
		System.out.println("Rows are "+r);
		System.out.println("Columns are "+c);
		//Cell is loaded then using getContents method we have  to extract the data using getContents() methods
		// this method will always return you String.
		// now you are done
		
		}
		catch(BiffException e){
		e.printStackTrace();
		}
		catch(IOException io){
			io.printStackTrace();
		}}}