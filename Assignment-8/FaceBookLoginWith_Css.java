package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class FaceBookLoginWith_Css {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("asdfgr");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("as12fg");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("dsansfvdaer@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("dsansfvdaer@gmail.com");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("asl;kfj4336@");
		Thread.sleep(2000);

		Select monthDD= new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		monthDD.selectByIndex(5);
		Select dayDD = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		dayDD.selectByValue("9");
		Select yearDD = new Select(driver.findElement(By.cssSelector("select[id='year']")));
		yearDD.selectByValue("1980");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		//driver.close();

	}

}
