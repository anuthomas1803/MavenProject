package inheritanceexmple;

public class MultichildC extends MultichildB{
	double Salary;
	public void total()
	{    super.calc();
		Salary=(basicpay+hra+pf+deduction+bonus);
		System.out.println("Salary is " +Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultichildC obj=new MultichildC();
		obj.getdata(25000.0f,34556.0f,23455.0f);
		obj.total();

	}

}
