package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingURL_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userName=driver.findElement(By.cssSelector("input[name='username']"));
		userName.sendKeys("Admin");
		WebElement passWord =driver.findElement(By.cssSelector("input[type='password']"));
		passWord.sendKeys("admin123");
		WebElement submit =driver.findElement(By.cssSelector("button[type='submit']"));
		submit.click();
		
		
		String Url= driver.getCurrentUrl();
		System.out.println("Current Url is: "+Url);
		System.out.println("Cureent Url contains dashboard is :"+Url.contains("dashboard"));
		//clicking on image
		Thread.sleep(4000);
		WebElement image =driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		System.out.println(image.getText());
		image.click();
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		System.out.println(logOut.getText());
		logOut.click();
		System.out.println("Logout Successful");
		String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.navigate().to(baseUrl);
		if(Url.equalsIgnoreCase(baseUrl)) {
			System.out.println(baseUrl);
			
		}
		//driver.navigate().to(baseUrl);
		
	}

}
