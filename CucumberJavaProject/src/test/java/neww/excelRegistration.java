package neww;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import Constants.Constant;
import utility.excelUtils;

public class excelRegistration {
   static excelUtils excel = new excelUtils();
   static String excelFilePath = Constant.Path_TestData + Constant.File_TestData;
   public static void main(String[] args) throws IOException, InterruptedException {
	   
	   
	   excel.setExcelFile(excelFilePath,"Sheet1");
	   for(int i=0;i<excel.getRowCountInSheet();i++) {
	   WebDriver driver = new ChromeDriver();
	   driver.get(Constants.Constant.URL);
		driver.manage().window().maximize();
//	   excelUtils excel = new excelUtils();
		element el = new element(driver);
	   el.Firstname.sendKeys(excelUtils.getCellData(i,0));
	   el.Lastname.sendKeys(excelUtils.getCellData(i,1));
   	   el.email.sendKeys(excelUtils.getCellData(i,2));
   	   el.phone.sendKeys(excelUtils.getCellData(i,3));
   	   el.address.sendKeys(excelUtils.getCellData(i,4));
   	   
   	Thread.sleep(5000);
	driver.quit();
	System.out.println(i);
	System.out.println();
	   }
	
	   
}
}
