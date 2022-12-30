package assignment_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InueronSignUp_Button {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement submitBtn=driver.findElement(By.className("submit-btn"));
		System.out.println(submitBtn.getText());
		
		System.out.println(submitBtn.isEnabled());
		
		driver.close();
	}

}
