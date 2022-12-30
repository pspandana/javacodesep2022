package assignment_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inueron_SignUp_From {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Asshok");
		driver.findElement(By.id("email")).sendKeys("ashok1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ashjkt56");
		List<WebElement>options=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele: options) {
			
			ele.click();
			
		}
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Select state = new Select(driver.findElement(By.id("state")));
		 state.selectByValue("Assam");
		 
		 WebElement submitButton =driver.findElement(By.className("submit-btn"));
		 System.out.println(" Is Submit button enabled? "+submitButton.isEnabled());
		 submitButton.click();
		 

		

		//driver.close();
	}

}
