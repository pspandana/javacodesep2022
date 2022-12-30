package assignment5;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		List<WebElement>footerLkS = driver.findElements(By.tagName("a"));
		
		System.out.println("Total  no of social links :"+footerLkS.size());
		
	
		for(WebElement ele : footerLkS) {
			System.out.println(ele.getAttribute("href"));
			if(ele.getText().equalsIgnoreCase("youtube")) {
				System.out.println(ele.getText());
				break;
			}
			
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
