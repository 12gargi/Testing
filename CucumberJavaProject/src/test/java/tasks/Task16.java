package tasks;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {
//scenario:Exception handling when finding elements by non-existing XPath
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Frames.html");

	        try {
	            WebElement elementFromNonExistingXPath = driver.findElement(By.xpath("//div[not(exists())]"));
	            System.out.println("Found element with non-existent XPath: " + elementFromNonExistingXPath);
	        } catch (NoSuchElementException ex) {
	            System.out.println("Encountered NoSuchElementException due to non-existing XPath.");
	        }

	        
	        

	}

}
