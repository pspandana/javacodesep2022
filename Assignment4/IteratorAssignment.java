package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorAssignment {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(30,45,78,56,12);
		
		
	Iterator<Integer> itr=numbers.iterator();
	while(itr.hasNext()){// hasnext only gives true or false 
	int x1=	itr.next();//next store the value and increment 
	System.out.println(x1);
	}

	}

}
