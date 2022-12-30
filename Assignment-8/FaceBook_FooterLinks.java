package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_FooterLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement>allLinks=driver.findElements(By.xpath("//ul[contains(@class,'uiList')]/li/a"));
		//String links =allLinks
		System.out.print(allLinks.size());
		//Traversing through the list and printing its text along with link address
		for(WebElement links:allLinks) {
			
			System.out.println(links.getText()+"-----"+links.getAttribute("href"));
		
		}
		
	}

}
