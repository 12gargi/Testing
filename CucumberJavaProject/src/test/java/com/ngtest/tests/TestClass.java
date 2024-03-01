package com.ngtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
    @Test
	public void google() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	driver.findElement(By.name("q")).sendKeys("Hello worlds",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
    @Test
    public void facebook() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.name("q")).sendKeys("Hello worlds",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
