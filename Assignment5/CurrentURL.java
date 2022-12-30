package assignment5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CurrentURL{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//getiing the current url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		
//Capture the application url and verify url contains “demo”
		boolean demo = driver.getCurrentUrl().contains("demo");
		System.out.println("URL Contains demo: "+demo);
	
		
		
		//Capture the application title and verify title contains HRM 
		System.out.println("Title Is: "+driver.getTitle());
		boolean title = driver.getTitle().contains("HRM");
		System.out.println("Title Contains HRM: "+title);
		
		//actual title
		String my_title= driver.getTitle();
		
		
		
		driver.close();
	}

}
