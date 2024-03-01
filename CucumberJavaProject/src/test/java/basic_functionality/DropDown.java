package basic_functionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement element = driver.findElement(By.xpath("//div[@class='example']/h3[text() = 'Dropdown List']"));
		System.out.println(element.getText());

		Select drpdwn = new Select(driver.findElement(By.id("dropdown")));
		drpdwn.selectByValue("2");
		
		
		
		
	    
		
	    
		  
	}

}
