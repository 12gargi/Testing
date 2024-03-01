package basic_functionality;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		System.out.println(driver.findElement(By.cssSelector("#countries > tbody > tr:nth-child(1) > td:nth-child(1) > h3 > strong")));
		Random ran = new Random();
		int index = ran.nextInt(2, 198);
		List<WebElement> element =  driver.findElements(By.xpath("//tr"));
		
		WebElement eleet = element.get(index).findElement(By.className("hasVisited"));
		eleet.click();
		
		String content= element.get(index).getText();
		System.out.println(" Printed values are :"+ index+" "+content);
		
		
		//implicit is only applicable for findelement
		//write alll method manually and with its meaning
		//Automation Demo Site
		//pop up 
		

	}

}
