package mukesh_day1;

public class NoFinding {

	public static void main(String[] args) {
		//Task 9- Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
		
	int []marks = {12,34,66,85,900};
	
	for(int x: marks) {
		if(x==85) {
			System.out.println("Number found and breaking the execution");
			break;
		}
		System.out.println(x);
	}
	
	

}}
