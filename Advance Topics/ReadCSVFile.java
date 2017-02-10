package advanceTopics;


import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVFile {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("./data/CSV.csv");
		CSVReader cr = new CSVReader(fr);
		List<String[]> li = cr.readAll();
		System.out.println("We got total rows "+li.size());
		Iterator<String[]> it = li.iterator();
		
		while(it.hasNext()){
			String [] s1 = it.next();
			for (int i=0;i<s1.length;i++){
				System.out.println("We have "+s1[i]);
			}
			System.out.println();				
		}
			}
}
