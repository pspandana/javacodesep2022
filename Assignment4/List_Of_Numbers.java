package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Create a list of numbers 33,44,55,66,77,88 and perform below operation
 * 
 * Remove second element from list using index
	Remove second element from list using value
	Add 90 at index 3
	Get the length of list
	Print all values from list using any values
	Convert List into array.


 */
public class List_Of_Numbers {

	public static void main(String[] args) {
	 List<Integer>	numbers = new ArrayList<>();
	 numbers.add(33);
	 numbers.add(44);
	 numbers.add(55);
	 numbers.add(66);
	 numbers.add(77);
	 numbers.add(88);
	 System.out.println("Size Of The List Is :"+numbers.size());
	 System.out.println(numbers);
	// Remove second element from list using index
	 
	 System.out.println("Removing the number from the list is "+numbers.remove(1));
	 System.out.println();
	 //removing the value using number directly 
	 System.out.println(numbers.remove(Integer.valueOf(55)));
	 System.out.println(numbers);
	 //adding 90 at index 3
	 
	numbers.add(3, 90);
	System.out.println(numbers);
	
	//size of the list
	System.out.println("Size Of The List Is :"+numbers.size());
	
	

	}

}
