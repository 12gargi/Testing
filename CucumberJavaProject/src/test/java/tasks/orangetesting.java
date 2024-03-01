package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

public class orangetesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//test.log(Status.INFO,"user entered username");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//test.log(Status.INFO,"user entered password");
		driver.findElement(By.id("login-button")).click();
		System.out.println("login process completed");
		//test.log(Status.INFO,"login process completed");
	}

}
