package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_message_Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
		userName.sendKeys("Admin");
		
		WebElement passWord =driver.findElement(By.cssSelector("input[type='password']"));
		passWord.sendKeys("mukesh");
		WebElement submit =driver.findElement(By.cssSelector("button[type='submit']"));
		
		submit.click();
		Thread.sleep(3000);
		//getting invalid credentials message
		WebElement actual_msg= driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
		System.out.println("Printing Error Message"+actual_msg.getText());
		
		
			}

}
