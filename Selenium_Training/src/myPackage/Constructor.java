package myPackage;

public class Constructor {

	public Constructor()
	{
		System.out.println("I am inside Default Constructor");   //4th statement call
	}
	
	public Constructor(int a)
	{
		this(); //3rd statement call
		System.out.println("I am inside 1 Parameterized Constructor"); //5th statement call
	}
	
	public Constructor(int b, int c ,int d)
	{
		this(1); //2nd statement call
		System.out.println("I am inside 3 Parameterized Constructor");  // 6th statement call
	}
	
	public Constructor(int e, int f)
	{
		this(1,2,3);//1st statement call
	
		System.out.println("I am inside 2 Parameterized Constructor");//7th statement call
	}
	
	
	public static void main(String[] args) {
	

		Constructor con= new Constructor(1,2);
		
	}

}
