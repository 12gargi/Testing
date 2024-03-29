package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class dataprovider1 {
	@Test(dataProvider="testdata")
	public void TestChrome(String uname,String password){
		System.setProperty("webdriver.chrome.driver", "Path of the driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		driver.findElement(By.name("session[username_or_email]")).clear();
		driver.findElement(By.name("session[username_or_email]")).sendKeys(uname);
		driver.findElement(By.name("session[password]")).clear();
		driver.findElement(By.name("session[password]")).sendKeys(password);
	}
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){

		Object [][] twitterdata=new Object[2][2];

		twitterdata[0][0]="username1@gmail.com";
		twitterdata[0][1]="Password1";
		twitterdata[1][0]="username2@gmail.com";
		twitterdata[1][1]="Password2";
		return twitterdata;
	}
}

