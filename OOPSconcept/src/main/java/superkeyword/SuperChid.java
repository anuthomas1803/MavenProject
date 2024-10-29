package superkeyword;

public class SuperChid extends SuperParent{
	String Name="Banu";
	int Id=24;
	public SuperChid(){
		super(); 
		System.out.println("child constructor");
	}

	public void display()
	{ 
		super.display();
	System.out.println("CHILD method");
		System.out.println("Details of Parent Employee is  " +super.Name +" " +super.Id);
		System.out.println("Details of Child Employee is  " +Name +" "+Id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChid  obj1=new SuperChid();
		obj1.display();
		
	}

}
