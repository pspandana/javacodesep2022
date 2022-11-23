package assignment4;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven 
 */
public class Removing_Same_Elements {

	public static void main(String[] args) {
		ArrayList<String> ar1= new ArrayList<>(Arrays.asList("java","TestNG","Maven","java"));
		ArrayList<String> ar2= new ArrayList<>(Arrays.asList("java","TestNG","Maven"));
		System.out.println("list 1:"+ ar1);
		System.out.println("list 2:"+ ar2);
		ar2.retainAll(ar1);
		
		System.out.println("printing common elements from both lists:"+ar2);

	}

}
