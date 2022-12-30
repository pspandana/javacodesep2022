package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginField {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
		System.out.println(userName.isEnabled());
		WebElement passWord =driver.findElement(By.cssSelector("input[type='password']"));
		System.out.println(passWord.isEnabled());
		System.out.println(userName.getCssValue("border"));
		System.out.println(passWord.getCssValue("border"));
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}