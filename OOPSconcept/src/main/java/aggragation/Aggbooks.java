package aggragation;

public class Aggbooks {
String book_name;
int Bk_no;
Agglibrary libobj;
  public Aggbooks(Agglibrary libobj,String book_name,int Bk_no)
  {
	  this.libobj=libobj;
	  this.book_name=book_name;
	  this.Bk_no=Bk_no;
  }
  public void display()
  {
	  System.out.println("Details of library is " +libobj.Name +" "+libobj.place );
	  System.out.println("Details of book is " +book_name +" " +Bk_no);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agglibrary obj1=new Agglibrary("City Library","KTR");
		Aggbooks obj2=new Aggbooks(obj1,"oops",23);
		obj2.display();
}
}