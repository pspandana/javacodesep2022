package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfIntegers {
//Write a program which can store List of Integer values and print all the values using for loop.

	public static void main(String[] args) {
		List<Integer> number= Arrays.asList(10,20,36,89,78);
		
		for(int i=0; i<number.size();i++) {
			System.out.print(number.get(i)+" ");
		}
		
	}

}
