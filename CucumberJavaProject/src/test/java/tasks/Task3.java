package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//scenario :- dropdown selection
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.automationtesting.in/Register.html");
	     driver.manage().window().maximize();
	     WebElement country = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
	     country.click();
	     Select countrySelect = new Select(country);
	     countrySelect.selectByVisibleText("Australia");
	     
	    
	}

}
