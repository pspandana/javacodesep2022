package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Create a list of String and print the values in reverse order
Input – Java, Selenium, TestNG, Git, Github
	Output- Github, Git, TestNG, Selenium, Java

 * 
 * 
 */
public class ReverseOrder {

	public static void main(String[] args) {
		List<String> webTechnologies = Arrays.asList("Java","Selenium","TestNG","Git","Github");
		System.out.println("-----------printing values from string------------");
		for(int i=0;i<webTechnologies.size();i++) {
			System.out.println(webTechnologies.get(i));
		}
		System.out.println("-----------Printing in reverse order--------");
		for(int i=webTechnologies.size()-1;i>=0;i--) {
			System.out.println(webTechnologies.get(i));
		}
		
	}

}
