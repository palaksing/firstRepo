package myPackage;

public class Student {
	int age;
	int roll_number;
	
	public void display1()
	{
		System.out.println("Welcome All");
	}
	
	public void display2()
	{
	System.out.println("Automation is very easy");	
	System.out.println("Doing changes");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display1();
		s.display2();
		
		s.age=30;
		System.out.println("The age is:-" +s.age);
		
		s.roll_number=101;
		System.out.println("Roll number is:-" +s.roll_number);
		
	}

}
