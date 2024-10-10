package hierarchichal;

public class ChildC extends ParentA  {
	public void prod()
	{
		int e=a*b;
		System.out.println("Product is " +e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildC obj3=new ChildC();
		obj3.add();
		obj3.prod();
		
	}	
	}
