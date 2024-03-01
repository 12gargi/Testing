package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebookpage {
	
WebDriver driver;
	
	public Facebookpage(WebDriver driver) {
		
		this.driver  = driver;
	}
	
	WebElement username_editbox = driver.findElement(By.id("email"));
	WebElement password_editbox = driver.findElement(By.id("pass"));
	WebElement login_btn = driver.findElement(By.name("login"));
	
	public void EnterUserName()
	{
		username_editbox.clear();
		username_editbox.sendKeys("Testuser");
		
	}
	
	public void EnterPassword()
	{
		password_editbox.clear();
		password_editbox.sendKeys("Tester123");
		
	}
	
	public void VerifyLogin()
	{
		login_btn.click();
		String title = driver.getTitle();
		assertEquals(title,"Login page");
		
	}
	
	
	

}
