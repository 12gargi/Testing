package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task19 {
//Scenario:Verify that selecting multiple skills from the dropdown works correctly
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Register.html");

	        Select skillsDropdown = new Select(driver.findElement(By.id("Skills")));
	        
	        skillsDropdown.selectByVisibleText("Java");
	        skillsDropdown.selectByVisibleText("Python");
	        
	        List<WebElement> selectedOptions = skillsDropdown.getAllSelectedOptions();

	}

}
