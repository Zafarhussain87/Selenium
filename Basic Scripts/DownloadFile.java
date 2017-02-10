package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares/geckodriver.exe");
		
		FirefoxProfile pf = new FirefoxProfile();
		
		 pf.setPreference("browser.helperApps.neverAsk.openFile",  "application/octet-stream");
		//pf.setPreference("browser.helperApps.neverAsk.saveToDisk" , "application/octet-stream");//application/csv;text/csv;application/vnd.ms-excel;"); 
		//pf.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		//pf.setPreference("browser.helperApps.alwaysAsk.force", false);
		//pf.setPreference("browser.download.manager.showWhenStarting",false);
		
		WebDriver dr = new FirefoxDriver(pf);
		
		dr.get("http://filehippo.com/download_free_pdf_reader/");
		dr.findElement(By.xpath("//*[@id='program-header']/div[2]/a[1]")).click();

	}

}
