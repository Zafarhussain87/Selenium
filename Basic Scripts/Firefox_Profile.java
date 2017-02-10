package testCase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {

		ProfilesIni init=new ProfilesIni();
		 
		 
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
        // Get the default session  

        FirefoxProfile profile=init.getProfile("default");


        
       // Pass the session/profile to FirefoxDriver 

        WebDriver driver=new FirefoxDriver(profile);

        driver.get("http://learn-automation.com/");


	}

}
