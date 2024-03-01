package neww;
 
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import neww.element.*;
import utility.methods;
import Constants.Constant;
 
public class Test {
	
 
	public static void main(String[] args) throws IOException, ParseException, InterruptedException {
		// TODO Auto-generated method stub
		  
		JSONParser jsonParser =new JSONParser();
		FileReader reader =new FileReader( Constant.Path_TestData + "userData.json");

		Object obj = jsonParser.parse(reader);

		JSONArray usersList = (JSONArray) obj;
		for(int i=0; i<usersList.size(); i++) {
			
			WebDriver driver=new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get(Constants.Constant.URL);
			driver.manage().window().maximize();
			JSONObject users = (JSONObject) usersList.get(i);
			
			ElementInterfce element = new ElementImpl(driver);              //ElementInterfce Interface
//			methods me = new methods();
//			element e=new element(driver);                                //element class
//			//String username = (String) users.get("Firstname");
//			me.sendOperation(e.Firstname,Firstname);
//			
//			e.Firstname.sendKeys(username);
//			String user2 = (String) users.get("Lastname");
//			e.Lastname.sendKeys(user2);
//
//			String user3 = (String) users.get("email");
//			e.email.sendKeys(user3);
//
//			String user4 = (String) users.get("phone");
//			e.phone.sendKeys(user4);
//		
			element.setFirstName((String) users.get("Firstname"));
			element.setLastName((String) users.get("Lastname"));
			element.setEmail((String) users.get("email"));
			element.setGender();
			element.setPhone((String) users.get("phone"));
			element.setAddress((String) users.get("address"));
			//element.setDob((String) users.get("dob"));
			//element.setSubject((String) users.get("subject"));
			//element.setHobbies();
			js.executeScript("window.scrollBy(500,500)", "");
			element.submit();
			
			
			Thread.sleep(1000);
			driver.quit();
			System.out.println(i);
			System.out.println(users);
		}
		
        
        
        
        
	}
}