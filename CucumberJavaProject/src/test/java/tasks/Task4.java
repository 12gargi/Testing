package tasks;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




//Scenario:- Test Case to Switch to Second Window and validate
public class Task4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testrigtechnologies.com/");
		driver.findElement(By.xpath("//*[@id=\"copyright\"]/div/div[2]/ul/li[4]/a/i")).click();
		String cid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		
		for(String i:allid)
		{
			if(!(i.equals(cid))){
				driver.switchTo().window(i);
			}
		}
		//driver.switchTo().window(cid);
		//driver.findElement(By.cssSelector("#organization_guest_contextual-sign-in > div > section > button > icon > svg > path")).click();
	}
}

