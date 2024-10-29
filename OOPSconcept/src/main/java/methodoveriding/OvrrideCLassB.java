package methodoveriding;

public class OvrrideCLassB extends OvrrideCLassA{
	int ID=23;
	String place="kottarakara";
	public void display() //method overriding: same methods with same arguments in different classes(parent and child)
	 {  
		 super.display();
		 System.out.println("New Name is " +Name);
		 System.out.println("New Id id " +ID);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OvrrideCLassB obj1= new OvrrideCLassB();
		obj1.display();
	}

}
