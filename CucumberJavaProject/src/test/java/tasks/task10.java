package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task10 {
//scenario:Verify that clicking on the 'Reset' button clears all entered data in the form:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Register.html");

	        

	        WebElement resetButton = driver.findElement(By.xpath("//input[@value='Reset']"));
	        resetButton.click();

	        

	        WebElement nameField = driver.findElement(By.id("first_name"));
	        WebElement lastNameField = driver.findElement(By.id("last_name"));
	        WebElement emailField = driver.findElement(By.id("email"));
	        

	        if (nameField.getText().isEmpty() && lastNameField.getText().isEmpty() && emailField.getText().isEmpty()) {
	            System.out.println("Form data cleared successfully after clicking Reset button.");
	        } else {
	            System.out.println("Form data was not cleared after clicking Reset button.");
	        }

	}

}
