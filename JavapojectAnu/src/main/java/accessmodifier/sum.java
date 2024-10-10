package accessmodifier;

public class sum{
	public void addpublc(int a,int b)
	{
	 int c = a+b;
	 System.out.println(+c);
	}
	private void addprivt(int a,int b)
	{
	 int c = a+b;
	 System.out.println(+c);
	}
	
	protected void addprotct(int a,int b)
	{
	 int c = a+b;
	 System.out.println(+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum obj=new sum();
        obj.addpublc(1,2);
        obj.addprivt(3,4);
        obj.addprotct(4,4);
	}

}
