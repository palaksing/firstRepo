package myPackage;


public class Constructor1 {

	public Constructor1()  
	{
		
		//4th call
		//System.out.println("I am inside Default Constructor");   
	}
	
	public Constructor1(int a)
	{
	    this(1,2);   //2nd call
	    
		//this();  //3rdcall
		//System.out.println("I am inside 1 Parameterized Constructor");  //5th call
	}
	
	
	public Constructor1(int e, int f)
	{
		
		this();  //3rd call
		
		//this(1);//2nd call
	    
		//System.out.println("I am inside 2 Parameterized Constructor");  //6th call
	}
	
	public Constructor1(int b, int c ,int d) 
	{
		
		this(1);  //1st
		
		
		//this(1,2);//1st statement called
		//System.out.println("I am inside 3 Parameterized Constructor");   //7th call
	}
	
	
	
	public static void main(String[] args) {
	

		Constructor1 con= new Constructor1(1,2,3);
		
	}

}

