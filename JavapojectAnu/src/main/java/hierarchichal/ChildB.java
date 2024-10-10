package hierarchichal;

public class ChildB extends ParentA{
	public void subs()
	{
		int d=a-b;
		System.out.println("Difference is " +d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildB obj3=new ChildB();
		obj3.add();
		obj3.subs();
	

	}

}
