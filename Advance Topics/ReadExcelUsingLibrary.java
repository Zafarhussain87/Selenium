package advanceTopics;

public class ReadExcelUsingLibrary {

	public static void main(String[] args) {


		ExcelReadLibrary rl = new ExcelReadLibrary(".\\data\\testdata.xlsx");
		System.out.println(rl.getData(0, 5, 0));

	}

}
