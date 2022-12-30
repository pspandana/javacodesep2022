package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Text_Capture {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text=driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
		System.out.println(text.getText());
		System.out.println(driver.getTitle());
		//verifying the text
		String actualText=text.getText();
		String expected="FaceBook Connect with friends and the world around you on Facebook.";
		
		if(expected.equalsIgnoreCase(actualText)) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
			System.out.println("Expected text is: "+expected);
			
		}
		driver.close();
	}

}
