package tasks;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task8 {
//Scenario :- Select a country from the dropdown list and verify the selection:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://demo.automationtesting.in/Register.html");

		    WebElement countryDropdown = driver.findElement(By.id("country"));
		    Select countrySelect = new Select(countryDropdown);
		    countrySelect.selectByVisibleText("India");

		    WebElement selectedOption = countrySelect.getFirstSelectedOption();
		    assertEquals(selectedOption.getText(), "India", "Selected country should be India.");

		    driver.quit();

	}

}
