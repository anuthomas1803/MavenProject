package abstraction_class_interface;

public class AbstrctClass2 extends AbstrctClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctClass2 obj1= new AbstrctClass2 ();
		obj1.display1(); obj1.data();
		AbstrctClass1.display(); //static method
		
	}
public void data()
{
System.out.println("Abstact method");	
}
	
}
