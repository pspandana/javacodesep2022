package assignment4;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90
 */
public class Changing_No {

	public static void main(String[] args) {
		ArrayList<Integer>n1= new ArrayList<>();
		n1.add(10);
		n1.add(45);
		n1.add(90);
		n1.add(45);
		n1.add(23);
		n1.add(90);
		n1.add(44);
		//System.out.println(n1.indexOf(1));
		System.out.println(n1);
		n1.indexOf(0);
		System.out.println("Index of 2 is: "+n1.get(1));
		System.out.println("Index of 5 is :"+n1.get(5));
	}

}
