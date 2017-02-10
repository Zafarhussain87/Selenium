package advanceTopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.TestingRepository;

public class Config_Demo {

	
	@Test
	public void testConfig() throws Exception{
		
		TestingRepository tr = new TestingRepository();
		System.setProperty("webdriver.gecko.driver", tr.getFirefoxpath());
		WebDriver dr = new FirefoxDriver();
		dr.get(tr.geturl());
		
		
	}

}
