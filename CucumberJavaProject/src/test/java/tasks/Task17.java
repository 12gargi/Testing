package tasks;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task17 {
//scenario:Exception handling when switching focus between frames:

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Frames.html");

	        try {
	            driver.switchTo().frame("non-existing-frame");
	            System.out.println("Switched to non-existing frame.");
	        } catch (NoSuchFrameException ex) {
	            System.err.println("Encountered NoSuchFrameException due to non-existing frame.");
	        }

	        
	        driver.quit();
	

}
	}
