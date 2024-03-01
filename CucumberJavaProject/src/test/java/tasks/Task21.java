package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task21 {
//Scenario: to switch to iframe inside iframe
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Frames.html");

	       
	        driver.switchTo().frame(0);

	       
	        WebElement firstIframeInput = driver.findElement(By.xpath("/html/body/section/div"));
	        firstIframeInput.sendKeys("Text entered in first iframe");

	        
	        driver.switchTo().defaultContent();

	        
	        driver.switchTo().frame("iframe2");

	        
	        WebElement secondIframeInput = driver.findElement(By.xpath("//input[@type='text']"));
	        secondIframeInput.sendKeys("Text entered in second iframe");

	        
	        driver.switchTo().defaultContent();

	        

	}

}
