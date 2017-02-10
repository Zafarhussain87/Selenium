package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://seleniumpractise.blogspot.fi/2016/11/handle-bootstrap-model-dialog-in.html");
		dr.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Zafar Malik");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("Zafar123");
		dr.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
