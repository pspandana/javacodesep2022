package assignment5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_AdminTab {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
			
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
			
			WebElement Login =driver.findElement(By.cssSelector("button[type='submit']"));
			Login.click();
			
			driver.findElement(By.xpath("//span[text()='Admin']")).click();
			WebElement addButton= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
			//System.out.println(addButton.getText());
			addButton.click();
		WebElement nameBox=	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']"));
			nameBox.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
				
		
			
			
			
			
			
			
//driver.close();
			
			
	}

}
