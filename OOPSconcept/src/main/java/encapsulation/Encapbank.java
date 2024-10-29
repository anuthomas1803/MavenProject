package encapsulation;

public class Encapbank {
private String Username;
private int PIN;
public void setter(String Username,int PIN)
{
	this.Username=Username;
	this.PIN=PIN;
}
public void getter()
{
if((PIN==121)||(PIN==122))
{
	System.out.println("LOGIN " +Username);
}
else
{
System.out.println("Unable to login");	
}
}
}
