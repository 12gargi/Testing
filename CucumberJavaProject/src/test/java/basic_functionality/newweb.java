package basic_functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newweb {
  public static void main(String []args) {
	  WebDriver driver = new ChromeDriver();
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	  
	  WebElement element = driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"));
	  element.click();
	  
	  WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	  Boolean status = element1.isDisplayed();
	  
	  if(status)
	  {
		  System.out.println("Web Driver is visible");
	  }
	  else
	  {
		  System.out.print("Web Driver is not visible");
	  }
	  driver.quit();
  }
}
