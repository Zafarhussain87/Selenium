package advanceTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginWP {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D://Selenium//softwares//geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://demosite.center/wordpress/wp-login.php");
		LoginForPOM login = new LoginForPOM(dr);
		
		/*login.typeName("admin");
		login.typePass("Demo123");
		login.clickButton();
		*/
		login.LoginToWordPress("admin", "Demo123");

	}

}
