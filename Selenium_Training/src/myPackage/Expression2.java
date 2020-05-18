package myPackage;

public class Expression2 {
	
	public int div(int a ,int b)
	{
		
	int division = a/b;
	System.out.println("the division result is:-"+division);
	return division;
	
	}
	
	public int sub(int c ,int d)
	{
		
	int subtract= c-d;
	System.out.println("The subtraction result is:-"+subtract);
	return subtract;
	
	}
	
	public int add(int e ,int f)
	{
	
		int addition= e+f;
		System.out.println("The addition result is:-"+addition);
		return addition;
	}
	
	
	public void mult(int g ,int h)
	{
	
		int multiply= g*h;
		System.out.println("The expression final result is:-"+multiply);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expression2 exp2 = new Expression2();
		int s1 = exp2.div(10, 2);
		int s2 = exp2.sub(s1,2);
		int s3 = exp2.add(s2, 2);
		int s4 = exp2.add(s3, 2);
		 exp2.mult(s4, 2);
	}

}
s