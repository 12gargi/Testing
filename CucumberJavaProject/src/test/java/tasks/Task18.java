package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task18 {
//Scenario:Verify that selecting a state updates the corresponding cities in the dropdown
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Register.html");

	        Select stateDropdown = new Select(driver.findElement(By.id("state")));
	        stateDropdown.selectByVisibleText("California");

	        

	        driver.quit();

	}

}
