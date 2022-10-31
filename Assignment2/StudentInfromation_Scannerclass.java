package assignment2;

import java.util.Scanner;

public class StudentInfromation_Scannerclass {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How many students do you want to enter today?");
	int size=sc.nextInt();
	String [] names= new String[size];
	
	for(int i=0;i<size;i++) {
		System.out.println("Enter The Name:");
		names[i]=sc.next();
		System.out.println("Enter Email;");
		names[i]=sc.next();
		
		
	}
	System.out.println("which student information you want?");
	int info=sc.nextInt();
	
	}
	
	}
	
	
	}
	







	


