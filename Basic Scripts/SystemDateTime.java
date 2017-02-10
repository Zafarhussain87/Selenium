package testCase1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDateTime {

	public static void main(String[] args) {
	
		/* Create object of SimpleDateFormat class and decide the format.
		 *  and always write small dd for date and capital MM for month. small mm for minutes and small ss 
		 *  for seconds.
		 */
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		 
		//get current date time with Date()
		Date dt = new Date();
		
		// Now format the date
		String date = df.format(dt);
		System.out.println("The date is "+date);

	}

}
