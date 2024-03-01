package tasks;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.FileReader;
import java.io.IOException;

import org.apache.hc.core5.http.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import Constants.Constant;

public class helooo {
	
	String firstname,lastname,email;
	String phone;

	public static void main(String[] args) throws ParseException, IOException, org.json.simple.parser.ParseException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(Constant.Path_TestData+"userData.json");
		Object obj = jsonParser.parse(reader);
		
		JSONArray usersList = (JSONArray) obj;
		JSONObject users = (JSONObject) usersList.get(0);
		System.out.println(users);
		
		String username = (String) users.get("firstName");
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstName.sendKeys(username);
		
//		helooo hell = new helooo();
//		hell.firstname = "Gargi";
//		hell.lastname = "Koparkar";
//		hell.email = "you@gmail.com";
//		hell.phone = "2342345";
//		
//		WebElement first = driver.findElement(By.id("firstName"));
//		first.sendKeys(hell.firstname);
//		first.clear();
//		WebElement last = driver.findElement(By.id("lastName"));
//		last.sendKeys(hell.lastname);
//		last.clear();
//		WebElement mail = driver.findElement(By.id("userEmail"));
//		mail.sendKeys(hell.email);
//		mail.clear();
//		WebElement number = driver.findElement(By.id("userNumber"));
//		number.sendKeys(hell.phone);
//		number.clear();
//		
////		driver.quit();
//		
//		helooo hey =new helooo();
//		hey.firstname = "josh";
//		hey.lastname = "Kumar";
//		hey.email = "me@gmail.com";
//		hey.phone = "2982345";
//		
//		WebElement first1 = driver.findElement(By.id("firstName"));
//		first1.sendKeys(hey.firstname);
//		
//		WebElement last1 = driver.findElement(By.id("lastName"));
//		last1.sendKeys(hey.lastname);
//		WebElement mail1 = driver.findElement(By.id("userEmail"));
//		mail1.sendKeys(hey.email);
//		WebElement number1 = driver.findElement(By.id("userNumber"));
//		number1.sendKeys(hey.phone);
//		
//		helooo heya =new helooo();
//		heya.firstname = "joshua";
//		heya.lastname = "Kumari";
//		heya.email = "mei@gmail.com";
//		heya.phone = "20882345";
//		
//		WebElement first2 = driver.findElement(By.id("firstName"));
//		first2.sendKeys(heya.firstname);
//		WebElement last2 = driver.findElement(By.id("lastName"));
//		last2.sendKeys(heya.lastname);
//		WebElement mail2 = driver.findElement(By.id("userEmail"));
//		mail2.sendKeys(heya.email);
//		WebElement number2 = driver.findElement(By.id("userNumber"));
//		number2.sendKeys(heya.phone);
		
		
		

	}

}