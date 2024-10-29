package inheritanceexmple;

public class MultichildB extends MultiparentA {
	double hra,pf;
	public void calc()
	{
hra= (0.05*basicpay);
 pf=0.20*basicpay;
System.out.println("HRA is "+hra);  
System.out.println("PF is " +pf);
	}
	
}
