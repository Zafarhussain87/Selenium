package testCase1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		dr.get("http:gmail.com");
		dr.findElement(By.id("next")).click();
		Thread.sleep(3000);
		String actual_error = dr.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getAttribute("innerHTML");
		System.out.println("The actual error msg is "+actual_error);
		String expected_error = "Please enter your email. ";
		Assert.assertEquals(actual_error, expected_error);
		
	}

}
