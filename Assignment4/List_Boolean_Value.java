package assignment3;

import java.util.Arrays;
import java.util.List;

/*Write a program which will display true if list contains Mobile else prints false
	List  - Web Automation, API Automation, Mobile Automation.
	Output – True 

*/
public class List_Boolean_Value {

	public static void main(String[] args) {
	
		List<String>testing= Arrays.asList("Web Automation","API Automation","Mobile Automation");
		System.out.println(testing.contains("Mobile Automation"));
		System.out.println(testing.contains("Automation"));

	}

}
