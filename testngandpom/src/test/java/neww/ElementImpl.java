package neww;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementImpl implements ElementInterfce {
	private WebDriver driver;
	private WebElement firstName,lastName,email,gender,phone,address,submitt;
	
	public ElementImpl(WebDriver driver)
	{
		this.driver = driver;
		firstName=driver.findElement(By.id("firstName"));
		lastName=driver.findElement(By.id("lastName"));
		email=driver.findElement(By.id("userEmail"));
		gender = driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1)"));
		phone=driver.findElement(By.id("userNumber"));
		address = driver.findElement(By.id("currentAddress"));
		submitt= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		//subject = driver.findElement(By.id("subjectsContainer"));
//		dob = driver.findElement(By.id("dateOfBirthInput"));
//		hobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
		
		
		
	}
	
	public void setFirstName(String value)
	{
		firstName.sendKeys(value);
	}
	public void setLastName(String value)
	{
		lastName.sendKeys(value);
	}
	public void setEmail(String value)
	{
		email.sendKeys(value);
	}
	public void setGender()
	{
		gender.click();
	}
	
	public void setPhone(String value)
	{
		phone.sendKeys(value);
	}
	public void setAddress(String value)
	{
		address.sendKeys(value);
	}
	public void submit()
	{
		submitt.click();
	}

	//@Override
//	public void setGender() {
//		// TODO Auto-generated method stub
//		
//	}
	
//	public void setSubject(String value)
//	{
//		subject.sendKeys(value);
//	}
//	public void setDob(String value)
//	{
//		dob.sendKeys(value);
//	}
//	
//	public void setHobbies()
//	{
//		hobbies.click();
//	}
	
	
	

}
