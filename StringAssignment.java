package mukesh_day1;

public class StringAssignment {

	public static void main(String[] args) {
		// Task 10- Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
		
		String [] name = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(String x: name) {
			
			if(x=="Selenium") {
				System.out.println("Breaking the loop");
				break;
			}
			System.out.println(x);
		}

	}

}
