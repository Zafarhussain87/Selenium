package advanceTopics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Authenticate {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		Thread.sleep(3000);
		dr.get("https://zafar:hussain@www.engprod-charter.net/");
		//Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\Browser_Authentication.exe");
		Thread.sleep(3000);
		
		
		

	}

}
