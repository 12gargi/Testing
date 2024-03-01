package tasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
//scenario:confirmation alert
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Alerts.html");

	        driver.findElement(By.cssSelector("#CancelTab > buttons")).click();

	        Alert confirmationAlert = driver.switchTo().alert();
	        System.out.println("Alert Text: " + confirmationAlert.getText());
	        confirmationAlert.dismiss();
	}
}
