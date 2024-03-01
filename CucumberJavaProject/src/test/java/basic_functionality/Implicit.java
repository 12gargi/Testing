package basic_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/waits/");
		//WebElement element = driver.findElement(By.cssSelector("<h4 class=\"alert-heading text-center m-0\">WebDriver BiDi is the future of cross-browser automation. <a href=\"https://developer.chrome.com/docs/web-platform/best-practices/webdriver-bidi\" target=\"_blank\" aria-pressed=\"true\">Read all about it!</a></h4>"));

	}

}
