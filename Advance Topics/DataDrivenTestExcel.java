package advanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestExcel {
	WebDriver dr;
	@Test(dataProvider = "Facebook Login")
	public void testdata(String name, String pass) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		dr = new FirefoxDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("http:www.facebook.com");
		dr.findElement(By.xpath("//*[@id='email']")).sendKeys(name);
		dr.findElement(By.xpath("//*[@id='pass']")).sendKeys(pass);
		dr.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(5000);
		String actual_val = dr.getTitle();
		Thread.sleep(4000);
		System.out.println(actual_val);
		String expected_val = "Facebook";
		Assert.assertEquals(actual_val, expected_val);
		Thread.sleep(2000);	
	}
	@AfterMethod
	public void tearDown(){
		dr.quit();
	}
	
	@DataProvider(name="Facebook Login")
	public Object[][] loginData(){
		ExcelReadLibrary erl = new ExcelReadLibrary("./data/testdata.xlsx");
		int row = erl.numberofRows(0);
		int col = erl.numberofCol(0);
				
		Object[][] data = new Object[row][col];
		
		for (int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			
			data[i][j] = erl.getData(0, i, j);
		}}
		return data; 
	}}
