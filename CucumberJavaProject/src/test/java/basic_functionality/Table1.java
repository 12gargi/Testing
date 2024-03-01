package basic_functionality;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //implicit wait does not fails the test it proceed to next step and returns the output
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> element =  driver.findElements(By.cssSelector("#countries > tbody > tr"));
		

		
		List<WebElement> element1 =  driver.findElements(By.cssSelector("#countries > tbody > tr:nth-child(5)>td"));
		int colcount = element1.size();
		
		List<WebElement> row = driver.findElements(By.xpath("//tr"));
		int rowcount = element.size();
		
		for(WebElement rowe : row)
		{
			List<WebElement> col = rowe.findElements(By.tagName("td"));
			
			for(WebElement ele : col)
			{
				System.out.print(ele.getText()+" ");
			}
			System.out.print("\n");
		}

	}

}
