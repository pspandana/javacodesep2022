package assignment10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ineuron_Course {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.name("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();
		
		System.out.println("Page Title Is: "+driver.getTitle());
		
		
		WebElement element =driver.findElement(By.xpath("//span[text()='Manage']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='thumbnail']")).sendKeys("C:\\Users\\saira\\Downloads\\image-blz-blog-how-to-install-selenium-webdriver-for-java-.jpg");
	driver.findElement(By.id("name")).sendKeys("Selenium-JavaScript");
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Best Place TO Learn Selenium With Zero Programming Knowledge!");
	driver.findElement(By.xpath("//input[@name='instructorName']")).sendKeys("Sdana");
	WebElement price =driver.findElement(By.xpath("//input[@name='price']"));
	price.clear();
	price.sendKeys("100");
	Thread.sleep(2000);

	WebElement calenDer =driver.findElement(By.name("startDate"));
	calenDer.click();
	//find date for next month
	Thread.sleep(2000);
	WebElement monthEle =driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
	
	monthEle.click();
	
	
	//driver.findElement(By.xpath("//div[text()='26']")).click();	
	List<WebElement>allDates = driver.findElements(By.xpath("//div[contains(@role,'option')]"));
	
	for(WebElement ele : allDates) {
		String getDate = ele.getText();
		System.out.println("Dates Are  :"+getDate);
		if(getDate.contains("6")) {
			System.out.println("Found");
			ele.click();
			break;
		}
	}
	driver.findElement(By.name("endDate")).click();
	driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
	WebElement monthPicker = driver.findElement(By.className("react-datepicker__current-month"));
	
	System.out.println(monthPicker.getText());
	
	driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	
	List<WebElement>nextMonthDates =driver.findElements(By.xpath("//button[@aria-label='Next Month']"));
	
	for(WebElement ele1:nextMonthDates) {
		String date= ele1.getText();
		System.out.println("dates are:"+date);
		if(date.contains("5")) {
			
			ele1.click();
			break;
		}
		
		
			
		}
	WebElement category=driver.findElement(By.xpath("//div[text()='Select Category']"));
	category.click();
	System.out.println(category.getText());
	WebElement selectOption = driver.findElement(By.xpath("//button[text()='Selenium']"));
	selectOption.click();
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(5);
	
	driver.findElement(By.xpath("//*[@id=\"course_63bd8340fabc4adba7ef8ba3\"]/td[11]/button")).click();
	
	}
	
	}


