package multilevelinheritance;

public class ParentB extends Parent_A{
	
	public void sub()
	{
		int c=a-b;
		System.out.println(+c);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ParentB obj1=new ParentB();
			obj1.sub();
			obj1.addnum();
		}

	}

