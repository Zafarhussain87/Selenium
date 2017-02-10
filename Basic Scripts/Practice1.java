package testCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebok.com");
		
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("Zafar");
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("malik");
		
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
		//driver.findElement(By.id("u_0_h")).click();
		//<span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;">
		try{
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@title='month']")));
		sel1.selectByIndex(6);
		}
		
		 catch(NoSuchElementException e){
			 
			 System.out.println(e.getMessage());
		 };
		Select sel2 = new Select(driver.findElement(By.id("day")));
		sel2.selectByIndex(26);
		Select sel3 = new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("2000");
		driver.findElement(By.id("u_0_e")).click();
		driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']")).click();
		
		//driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(4000);
		driver.navigate().to("http://www.facebook.com");
	}

}
