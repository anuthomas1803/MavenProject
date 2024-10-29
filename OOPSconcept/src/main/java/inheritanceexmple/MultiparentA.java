package inheritanceexmple;

public class MultiparentA {
	float basicpay,deduction,bonus;
	public void getdata(float basicpay,float deduction,float bonus)
	{
		this.basicpay=basicpay;
		this.deduction=deduction;
		this.bonus=bonus;
		System.out.println("The basic pay is " +basicpay);
		System.out.println("The deduction is " +deduction);
		System.out.println("The bonus is " +bonus);
		
	}

}
