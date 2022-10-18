package mukesh_day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i, j, s;
		
		for(i=2;i<=1000;i++) {
			 s=0;  //Initial s value is 0
			 
			 for(j=2;j<i;j++) {
				 if(i%j==0) { //j value increases until it reach same value as i then condition will become false and break the loop.
					 
					 s=1;
					 break;
				 }
			 }
			 if(s==0) {
				 
				 System.out.print(i +" , ");
				
			 }
			
		}
}}
	


