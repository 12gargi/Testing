package Test_Scenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Facebookpage;
import Objects.googlesearch;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	
	googlesearch objectrepo;
	
	@BeforeTest
	public void beforetest() {
		driver= new ChromeDriver();
       	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        
	}
	
	@Test
	public void searchOperation() throws InterruptedException 
	{
		googlesearch page =new googlesearch(driver);
		page.seachgoogle("facebook");
	}
	
	@Test
	public void VerifyAccessFacebook()
	{
		objectrepo = new googlesearch(driver);
		objectrepo.ClickFacebook();
	}
	
	@Test
	public void VerifyLogin()
	{
		Facebookpage page = new Facebookpage(driver);
		page.EnterPassword();
		page.EnterPassword();
		page.VerifyLogin();
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

}
