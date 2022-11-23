package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Create a list which can accept another list as an element.
           List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
  	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>(); 		 
 */
public class InsertingList2 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> alist=new ArrayList<ArrayList<Integer>>(); 	
		ArrayList<Integer>l1 = new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		alist.add(l1);
		//System.out.println(alist);
		ArrayList<Integer>l2 = new ArrayList<>();
		l2.add(9);
		l2.add(19);
		l2.add(29);
		alist.add(l2);
		//System.out.println(alist);
		ArrayList<Integer>l3 = new ArrayList<>();
		l3.add(7);
		l3.add(17);
		l3.add(27);
		alist.add(l3);
		//System.out.println(alist);
		for(int i=0;i<alist.size();i++) {
			for(int j=0;j<alist.get(i).size();j++)
		
		System.out.print(alist.get(i).get(j)+" ");
		}
	}

}
