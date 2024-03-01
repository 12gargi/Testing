package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Scenario:- checkbox selection
public class Task2 {
    public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.automationtesting.in/Register.html");
	     driver.manage().window().maximize();
	     WebElement checkbox = driver.findElement(By.id("checkbox1"));
	     if(!checkbox.isSelected())
	     {
	    	 checkbox.click();
	     }
	}
}
