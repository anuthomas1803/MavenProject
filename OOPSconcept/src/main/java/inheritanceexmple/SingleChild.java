package inheritanceexmple;

public class SingleChild extends SingleParent{

	public void display()
	{
	System.out.println("First number " +a);
	System.out.println("Second number " +b);
	System.out.println("Sum is " +Sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.add(100,200);
		obj.display();

	}

	
}
