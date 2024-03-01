package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.automationtesting.in/Register.html");
	     driver.manage().window().maximize();
	     WebElement Tittle = driver.findElement(By.xpath("//*[@id=\"section\"]/div/h2"));
	     System.out.println(Tittle.getText());
	     
//	     WebElement Fullnamebox = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > label"));
//	     System.out.println(Fullnamebox.getText());
	     
	     WebElement Input1 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	     Input1.sendKeys("josh");
	    
	     
	     WebElement Input2 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	     Input2.sendKeys("kumar");
	     
	     
//	     WebElement Address = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > label"));
//	     System.out.println(Address.getText());
//	     
	     WebElement Input3 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	     Input3.sendKeys("Pheonix mall vimanagar, Pune 412207");
	     
	     
//	     WebElement Email = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[3]/label"));
//	     System.out.println(Address.getText());
	     
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
