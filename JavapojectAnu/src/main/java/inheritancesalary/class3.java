package inheritancesalary;

public class class3 extends class2{
double Total; 
public void total()
{
	Total=((Basicpay+hra+Bonus)-(pf+Deduction));
	System.out.println("Total Salary of the employee is " +Total);
}

	
		public static void main(String[] args) {
			
			
			class3 obj1=new class3();
					obj1.display(25000,2000,500);
					obj1.calc();
					obj1.total();
		}

	}


