package testCase1;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFiles {
	
	
	public static void main (String[] args) throws IOException, Throwable{
		
		//System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
		//WebDriver dr = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.tinyupload.com/");
		dr.findElement(By.name("uploaded_file")).click();
		//Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\MultipleFiles.exe"+" "+"D:\\Misc\\SampleFile.txt");
		//
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\MultipleFiles.exe"+" "+"D:\\Misc\\SampleFile.txt");
		Thread.sleep(2000);
		dr.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\MultipleFiles.exe"+" "+"D:\\Misc\\fileupload.html");
		Thread.sleep(2000);
		
		dr.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\MultipleFiles.exe"+" "+"D:\\Misc\\tech.docx");
		Thread.sleep(2000);
		
		dr.quit();
		
		
		
	}

}
