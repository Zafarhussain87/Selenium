package testCase1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.get("file:///D:/Selenium/fileupload.html");
		dr.findElement(By.xpath(".//*[@id='1']")).click();
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\Fileupload.exe");

	}

}
