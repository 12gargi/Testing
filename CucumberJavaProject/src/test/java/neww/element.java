package neww;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
 
public class element{
	
	
	private WebDriver driver;
	public WebElement Firstname,Lastname,email,phone,submitt,address;
		
	public element(WebDriver driver) {
		this.driver=driver;
		Firstname=driver.findElement(By.id("firstName"));
		Lastname=driver.findElement(By.id("lastName"));
		email=driver.findElement(By.id("userEmail"));
		phone=driver.findElement(By.id("userNumber"));
		address = driver.findElement(By.id("currentAddress"));
		submitt = driver.findElement(By.xpath("//button[@type=\"submit\"]"));   
 
	}
		
	
}