package testCase1;

//import org.testng.log4testng.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLogFile {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("CreateLogFile");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		log.info("Firefox opened");
		dr.get("http://www.ksrtc.in/");
		log.info("SIte is launched");
		
		dr.findElement(By.xpath("//*[@id='searchBtn']")).click();
		log.info("Clicked on search button");
		System.out.println(dr.switchTo().alert().getText());
		log.info("Printing message");
		//dr.switchTo().alert().accept();
		dr.switchTo().alert().accept();
		log.info("Alert accepted");
	}

}
