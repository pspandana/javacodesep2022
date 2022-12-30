package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBaccountSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Aaerwty");
		
		driver.findElement(By.name("lastname")).sendKeys("rewasd");
		driver.findElement(By.name("reg_email__")).sendKeys("4567891201");
		driver.findElement(By.id("password_step_input")).sendKeys("A23dfgrth");
		Thread.sleep(2000);
		Select monthDW= new Select(driver.findElement(By.name("birthday_month")));
		monthDW.selectByVisibleText("Jun");
		Select dayDW= new Select(driver.findElement(By.name("birthday_day")));
		dayDW.selectByValue("6");
		
		Select yearDW= new Select(driver.findElement(By.name("birthday_year")));
		yearDW.selectByValue("1990");
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		//driver.close();
	}

}
