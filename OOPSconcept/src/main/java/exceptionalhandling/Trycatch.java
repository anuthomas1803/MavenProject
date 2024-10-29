package exceptionalhandling;

public class Trycatch {
	static int a=10;
	static int c;
	public static void calc()
	{   
		try
		{
			c=a/0;
			System.out.println(" Ans is " +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception identified");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trycatch.calc();
	}

}
