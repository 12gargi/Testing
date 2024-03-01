package tasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task13 {
//scenario: simple alert
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("//button[text()='Click the button to display an alert box.']")).click();

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Alert Text: " + simpleAlert.getText());
        simpleAlert.accept();
	}
}
