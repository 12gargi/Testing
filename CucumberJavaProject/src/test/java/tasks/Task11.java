package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
//Scenario : Verify that the 'Date of Birth' field accepts a valid date:
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement dobField = driver.findElement(By.id("dob"));
        dobField.sendKeys("01/01/1990");

        driver.quit();
	}
}
