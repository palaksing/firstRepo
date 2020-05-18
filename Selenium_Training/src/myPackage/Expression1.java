package myPackage;

public class Expression1 {

	
	public int sum(int a ,int b)
	{
		
		int summation= a+b;
		System.out.println("sum is-"+summation);
		return summation;
	}
	
	public int sub(int c, int d)
	{
		
		int subtract= c-d;
		System.out.println("Difference  is-"+subtract);
		return subtract;
	}
	
	public int mul(int e, int f)
	{
		
		int multiply=e*f ;
		System.out.println("Multiplication  is-"+multiply);
		return multiply;
	}
	
	public void div(int g, int h)
	{
		
		int divide=g/h;
		System.out.println("Final expression result is-"+divide);
	}
	
	public static void main(String args[])
	{
		Expression1 exp =new Expression1();
		int s1=exp.sum(10, 2);
		int s2=exp.sub(s1, 2);
		int s3=exp.sum(s2, 2);
		int s4= exp.mul(s3, 2);
		exp.div(s4, 2);
	}
	
}

	
	
	