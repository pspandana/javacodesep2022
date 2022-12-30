package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_VerifyingPassWordField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
		userName.sendKeys("admin");
		
		WebElement passWord =driver.findElement(By.cssSelector("input[type='password']"));
		WebElement submit =driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println(submit.getText());
		submit.click();
		

	}

}
