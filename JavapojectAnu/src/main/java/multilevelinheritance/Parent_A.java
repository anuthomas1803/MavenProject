package multilevelinheritance;

public class Parent_A {
int a=100,b=20;
public void addnum()
{
	int c=a+b;
	System.out.println(+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent_A obj2=new Parent_A();
		obj2.addnum();
	}

}
