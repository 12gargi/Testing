package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task20 {
//scenario:to interact with an iframe on website
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Frames.html");

	        
	        driver.switchTo().frame("singleframe");

	       
	        WebElement iframeInput = driver.findElement(By.xpath("//input[@type='text']"));
	        iframeInput.sendKeys("Text entered in iframe");

	        
	        driver.switchTo().defaultContent();

	     

	}

}
