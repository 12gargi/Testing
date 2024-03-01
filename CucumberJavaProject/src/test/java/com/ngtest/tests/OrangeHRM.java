package com.ngtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	
	@Test
	public void LaunchApp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	}
	@Test
	public void EnterLoginDetails()
	{
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	     fname.sendKeys("josh");
	     WebElement lname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	     lname.sendKeys("kumar");
	     WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	     address.sendKeys("Pheonix mall vimanagar, Pune 412207");
	     WebElement Input4 = driver.findElement(By.cssSelector("#eid > input"));
	     Input4.sendKeys("joshkumar@mail.com");
	     WebElement Input5 = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
	     Input5.sendKeys("34657236485");
	     WebElement Input6 = driver.findElement(By.name("radiooptions"));
	     Input6.click();
	     WebElement Input7 = driver.findElement(By.id("checkbox2"));
	     Input7.click();
	     WebElement Input8 = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
	     Input8.sendKeys("Marathi");
		
	}
	
	

}
