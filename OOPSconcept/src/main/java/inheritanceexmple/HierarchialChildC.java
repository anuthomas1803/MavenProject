package inheritanceexmple;

public class HierarchialChildC  extends HierarchialparentA
{
		String Name;
		int Id;
		public void Testers(String Name,int Id)
		{  
			System.out.println("Tester");
			super.company();
			this.Name=Name;
		   this.Id=Id;
			System.out.println(" NAme of the developer is " +Name);
			System.out.println(" Id of the developer is " +Id);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HierarchialChildC  obj1=new HierarchialChildC();
			obj1.Testers("Anu", 32);
			HierarchialChildC  obj2=new HierarchialChildC();
			obj2.Testers("Shefeena", 30);

		}
	}
