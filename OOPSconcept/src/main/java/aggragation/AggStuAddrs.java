package aggragation;

public class AggStuAddrs {
String place;
int zipcode;
AggStuDetail Stuobj;
public AggStuAddrs(AggStuDetail Stuobj,String place,int zipcode)
{
		this.Stuobj=Stuobj;
		this.place=place;
		this.zipcode=zipcode;
}
public void getdata()
{
		System.out.println("Name of the student is " +Stuobj.Name);
	    System.out.println("Id of the student is " +Stuobj.Id);
	    System.out.println("Address of the student is " +place +" " +zipcode);
	    
}
public static  void main(String args[])
{
	AggStuDetail obj1=new AggStuDetail("Anu",23);
	AggStuAddrs obj2=new AggStuAddrs(obj1,"KTR",23344);
	obj2.getdata();

}

}
