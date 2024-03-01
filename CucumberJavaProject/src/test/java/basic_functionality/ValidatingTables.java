package basic_functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidatingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //implicit wait does not fails the test it proceed to next step and returns the output
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> element =  driver.findElements(By.cssSelector("#countries > tbody > tr"));
		int rowcount = element.size();
		System.out.println("Row size "+rowcount);
		
		//so all these elements need to be store somewhere so we store them in list
		List<WebElement> element1 =  driver.findElements(By.cssSelector("#countries > tbody > tr:nth-child(1)>td>h3"));
		int colcount = element1.size();
		System.out.println("Col Size "+colcount);
		
		 
		
	    for(WebElement ele : element1)
	    {
	    	System.out.println(ele.getText());
	    }
		
	
	}

}
