package inheritanceexmple;

public class HierarchialChildB extends HierarchialparentA {
	String Name;
	int Id;
	public void Developers(String Name,int Id)
	{  
		System.out.println("Developer");
		company();
		this.Name=Name;
	   this.Id=Id;
		System.out.println(" NAme of the developer is " +Name);
		System.out.println(" Id of the developer is " +Id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChildB  obj1=new HierarchialChildB();
		obj1.Developers("Ashik", 23);
		HierarchialChildB  obj2=new HierarchialChildB();
		obj2.Developers("Deepthy", 30);

	}
}
