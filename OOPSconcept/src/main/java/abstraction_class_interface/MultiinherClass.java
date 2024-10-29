package abstraction_class_interface;

public class MultiinherClass implements Inter1,Inter2 {
	public void disp()
	{
		System.out.println("interface1 method");
	}
	public void disp2()
	{
		System.out.println("interface2 method");
	}
	public void get()
	{
		System.out.println("interface1 Sum = " +(i+b));
	}
	public void get2()
	{
		System.out.println("interface2 Sum = " +(i+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiinherClass obj1=new MultiinherClass ();
		obj1.disp();
		obj1.get();
		obj1.disp2();
		obj1.get2();
	}

}
