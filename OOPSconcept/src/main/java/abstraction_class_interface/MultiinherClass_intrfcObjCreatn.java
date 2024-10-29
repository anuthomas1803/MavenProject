package abstraction_class_interface;

public class MultiinherClass_intrfcObjCreatn implements Inter1,Inter2 {
			public void disp()
		{
			System.out.println("interface1 method invoked by interface object creation");
		}
		public void disp2()
		{
			System.out.println("interface2 method invoked by interface object creation");
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
			MultiinherClass_intrfcObjCreatn obj1=new MultiinherClass_intrfcObjCreatn();
			obj1.disp();
			obj1.get();
			Inter2 obj2=new MultiinherClass_intrfcObjCreatn(); //interfacename obj=new classname();
			obj2.disp2();
			obj2.get2();
		}

	}

