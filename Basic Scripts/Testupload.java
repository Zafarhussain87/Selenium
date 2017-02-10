package testCase1;


	
	

	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

	public class Testupload {

		public static void main(String[] args) throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D://Selenium//softwares//chromedriver.exe");
			
			WebDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			dr.get("http://www.tinyupload.com/");
			Thread.sleep(2000);
			//dr.findElement(By.xpath(".//*[@id='1']")).click();
			dr.findElement(By.name("uploaded_file")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("D:\\Selenium\\AutoIt\\TestUpload.exe");

		}

	}



