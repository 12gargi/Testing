package Parallelism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class para1 {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent1;
	
	@BeforeSuite
	public void Setup() {
		
		driver=new ChromeDriver();
		htmlReporter = new ExtentHtmlReporter("extent1.html");
		extent1 = new ExtentReports();
		extent1.attachReporter(htmlReporter);
	}

	@Test
	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent1.createTest("Open Flipkart","to verify that user navigates on flipkart homepage");
		test.info("INFO:verifies that flipkart window opens");
		System.out.println("First Code is Running |"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		test.log(Status.INFO,"Landed on flipkart's HomePage");
		WebElement image = driver.findElement(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div > div > div._2nl6Ch > div._2NhoPJ > header > div._3ZqtNW > div._16ZfEv > a > picture > img"));
		 if(image.isDisplayed()) 
		 {
			 test.pass("flipkart logo is Displayed"); 
			 } else {
			  test.fail("flipkart logo is not displayed");
			  }
		 test.log(Status.INFO,"Landed on flipkart's HomePage");
		Thread.sleep(2000);
		driver.quit();
	}
 
	@Test
	public void test2() throws InterruptedException {
		driver.manage().window().maximize();
		ExtentTest test = extent1.createTest("Open Bookmyshow ","to verify that user navigates on bookmyshow homepage");
		test.info("INFO:verifies that bookmyshow window opens");
        System.out.println("Second Code is Running |"+Thread.currentThread().getId());
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		WebElement view = driver.findElement(By.cssSelector("#super-container > div.explore__DiscoveryContainerWrapper-sc-b1h692-2.dynGtA > div.explore__HeaderWrapper-sc-b1h692-3.GXyzK > header > div.bwc__sc-1nbn7v6-18.jhlWlM > div > div > div > div.bwc__sc-1shzs91-2.doUcwI > div.bwc__sc-1nbn7v6-3.ePsrRO > a > svg"));
		 if(view.isDisplayed()) 
		 {
			 test.pass("flipkart logo is Displayed"); 
			 } else {
			  test.fail("flipkart logo is not displayed");
			  }
		test.log(Status.INFO,"Landed on bookmyshow's HomePage");
		Thread.sleep(2000);
		driver.quit();
 
	}
	
	@AfterSuite	
	public void close() {
		extent1.flush();
		driver.quit();
	}
}
