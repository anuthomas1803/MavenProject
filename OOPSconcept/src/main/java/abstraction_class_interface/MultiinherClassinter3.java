package abstraction_class_interface;

public class MultiinherClassinter3 implements Inter3 {
	public void disp3()
	{
		System.out.println("interface3 method");
	}
	public void get3()
	{
		System.out.println("interface3 Sum = " +(c+b));
	}
	public void disp2()
	{
		System.out.println("interface2 method");
	}
	public void get2()
	{
		System.out.println("interface2 Sum = " +(c+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiinherClassinter3 obj1=new MultiinherClassinter3 ();
		obj1.disp2();
		obj1.get2();
		obj1.disp3();
		obj1.get3();
	
	
	}

}
