package tasks;
import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertFalse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
// Scenario :-Verify that the password strength meter changes based on the entered password
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://demo.automationtesting.in/Register.html");

		    WebElement passwordField = driver.findElement(By.id("firstpassword"));
		    passwordField.clear();
		    passwordField.sendKeys("weakpass");

		    WebElement passwordStrengthMeter = driver.findElement(By.xpath("//div[@class='progress-bar progress-bar-success']"));
		    double weakPassPercentage = Double.parseDouble(passwordStrengthMeter.getCssValue("width").replace("%", ""));

		    passwordField.clear();
		    passwordField.sendKeys("strongerpass");

		    passwordStrengthMeter = driver.findElement(By.xpath("//div[@class='progress-bar progress-bar-success']"));
		    double strongerPassPercentage = Double.parseDouble(passwordStrengthMeter.getCssValue("width").replace("%", ""));

		    assertFalse(weakPassPercentage >= strongerPassPercentage, "Weak password percentage should be less than strong password percentage.");

		    driver.quit();
	}
}
