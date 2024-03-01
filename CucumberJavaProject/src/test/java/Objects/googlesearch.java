package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearch {
	
	WebDriver driver;
	
	public googlesearch(WebDriver driver) {
		
		this.driver  = driver;
		
	}
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	WebElement searchbttn = driver.findElement(By.xpath("(//input[@name='btnk'])[1]"));
	WebElement facebook_link = driver.findElement(By.xpath("//a//h3[text()='Facebook - Log In or Sign Up']"));
	
	
	public void seachgoogle(String searchinput)
	{
		try {
		searchbox.sendKeys("Searchinput");
		Thread.sleep(1000);
		searchbttn.click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
		System.out.println("Exception Caught"+e.getMessage());
		}
	}
	
	public void ClickFacebook() {
		try {
			facebook_link.click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			System.out.println("Exception Caught" + e.getMessage());
		}
	}

}
