package assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		//name
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		//password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		//login
		WebElement Login =driver.findElement(By.cssSelector("button[type='submit']"));
		Login.click();
		//admin click
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		//add button click
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		 //user role
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		
		
	WebElement nameBox=	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
		nameBox.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Anil Yadav");
		

}
}