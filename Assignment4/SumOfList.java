package assignment3;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		// Write a program which will print sum of all numbers which is stored in list.
		List<Integer>s1 = new ArrayList<>();
		s1.add(20);
		s1.add(32);
		s1.add(56);
		//System.out.println(s1.size());
		//System.out.println(s1.addAll(s1));
		int sum= 0;
		for(int i=0;i<s1.size();i++) {
			sum +=s1.get(i);
			System.out.println(sum+ "  ");
			
		}
	}

}
