package tasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Task15 {
//scenario:prompt alert
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Alerts.html");
	        
//
//	        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
//	        button.click();
//
	        Alert alert = driver.switchTo().alert();
//	        alert.sendKeys("Hello, Prompt!");
//	        System.out.println("Entered text in Prompt: Hello, Prompt!");
//	        alert.accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Gargi");
		alert.accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText());

	}

}
