package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storing_Array_To_List {

	public static void main(String[] args) {
		//String s[]= {"sai","vani","venkat"};
		List<String>names= Arrays.asList("Babu","Vani","Sai");
		System.out.println(names);
		ArrayList<String>s1 = new ArrayList<>();
		s1.add("Sita");
		s1.add("Rama");
		s1.add("Laxmana");
		s1.add("Hanuma");
		System.out.println(s1);
		List<String>n1= Arrays.asList("Sita","Rama","Laxmana","Hanuma");
		System.out.println(n1);
	}

}
