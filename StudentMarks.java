package mukesh_day1;

public class StudentMarks {

	public static void main(String[] args) {
		/* Write a program to print below students marks who have scored above 80
			Example- 78,12,89,55,35
			Output-  78,89  */
		int marks[] = {78,12,89,55,81};
		//int i;
		for(int i:marks) {
			if(i>80) {
				System.out.println("Students Marks 80 and above::"+" " +i);
			}
			
		}
		
	}

}
