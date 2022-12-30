package assignment_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingUserCredentials {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("email1")).sendKeys("ashok1@gmail.com");
		driver.findElement(By.name("password1")).sendKeys("ashjkt56");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		System.out.println("Title of the Page is : "+driver.getTitle());
		//driver.close();
	}

}
