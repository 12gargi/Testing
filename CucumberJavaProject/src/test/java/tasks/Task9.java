package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
//Scenario: Upload a profile picture and verify the uploaded image:
	public static void main(String []args){
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Register.html");

    WebElement profilePictureInput = driver.findElement(By.id("imagesrc"));
    profilePictureInput.sendKeys("/path/to/profile_picture.jpg");

    WebElement uploadedImage = driver.findElement(By.id("imagetrgt"));
    String uploadedImageSrc = uploadedImage.getAttribute("src");

    if (uploadedImageSrc.contains("profile_picture.jpg")) {
        System.out.println("Uploaded image is displayed successfully.");
    } else {
        System.out.println("Uploaded image is not displayed.");
    }

    driver.quit();
	}
}
