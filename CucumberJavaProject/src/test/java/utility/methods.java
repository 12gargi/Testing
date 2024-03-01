package utility;

import org.openqa.selenium.WebElement;

public class methods {
	
	public void clickOperation(WebElement element)
	{
		element.click();
	}
	public void sendOperation(WebElement element,String data)
	{
		element.sendKeys(data);;
	}
	
	
}
