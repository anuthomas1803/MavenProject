package exceptionalhandling;

public class MultipleCatch {
		static int a[]= {1,2,3,4};
		static int d;
		static String s=null;
		public static void calc()
		{   
			try
			{
				int c= a[4]; //first exception in the try block is only consider even if there is multple exceptions in try block.
				System.out.println(" Ans is " +c);
				d=a[2]/0;
				System.out.println(" Ans is " +d);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception identified");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBounds exception identified");
			}
			
			try
			{
				System.out.println(s.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception identified");
			}
			System.out.println("REST OF THE CODE IS EXECUTED");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	MultipleCatch.calc();
		}

	}

