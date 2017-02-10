package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.ksrtc.in/");
		dr.findElement(By.xpath("//*[@id='searchBtn']")).click();
		System.out.println(dr.switchTo().alert().getText());
		//dr.switchTo().alert().accept();
		dr.switchTo().alert().accept();
	}

}
