package advanceTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForPOM {
	
	WebDriver dr;
	By username = By.id("user_login");
	By pass = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	
	public LoginForPOM(WebDriver dr){
		this.dr = dr;
		
	}
	public void LoginToWordPress(String userid, String passwd){
	dr.findElement(username).sendKeys(userid);
	dr.findElement(pass).sendKeys(passwd);
	dr.findElement(loginButton).click();	
	}
	
	public void typeName(String uid){
		dr.findElement(username).sendKeys(uid);
	}
	
	public void typePass(String passwd){
		dr.findElement(pass).sendKeys(passwd);
	}
	
	public void clickButton(){
		dr.findElement(loginButton).click();
	}
}
