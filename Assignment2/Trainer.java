package assignment2;

public class Trainer extends Trainer1{
	String name;
	String department;
	String email;
	int id;
	public Trainer(String name,String department,String email,int id) {
		
		this.name=name;
		this.department= department;
		this.email=email;
		this.id=id;
		
		
	}
	

	public static void main(String[] args) {
		Trainer t1= new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 12890);
		t1.trainer1();
		System.out.println("----**********------");
		Trainer t2= new Trainer("Rajesh", "Dev", "rajesh@gmail.com", 257390);
		t2.trainer2();
		System.out.println("----**********------");
		Trainer t3 = new Trainer("Prakash", "DevOps", "prakash10@gmail.com", 7845450);
		t3.trainer3();
		System.out.println("----**********------");
	}
	public void trainer1()
	{
		System.out.println("Name is: "+name);
		System.out.println("Department is :"+department);
		System.out.println("Email is :"+email);
		System.out.println("Id is :"+id);
		System.out.println("This trainer Teaches Selenium");
	}
	
	public void trainer2() {
		System.out.println("Name is: "+name);
		System.out.println("Department is :"+department);
		System.out.println("Email is :"+email);
		System.out.println("Id is :"+id);
		System.out.println("This trainer Teaches Web Development");
	}
	public void trainer3() {
		System.out.println("Name is: "+name);
		System.out.println("Department is :"+department);
		System.out.println("Email is :"+email);
		System.out.println("Id is :"+id);
		System.out.println("This trainer Teaches Devops");
		
		
	}
}
