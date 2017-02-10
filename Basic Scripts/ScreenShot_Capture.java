package testCase1;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.MultipleScreenShot;

public class ScreenShot_Capture {

	@Test
	public  void captureScreenshot() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		MultipleScreenShot.capturescreenshot(dr, "started");
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		Thread.sleep(5000);
		MultipleScreenShot.capturescreenshot(dr, "log in clicked");
	
}
	}


