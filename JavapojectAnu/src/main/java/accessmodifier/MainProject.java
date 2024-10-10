package accessmodifier;

public class MainProject {

	
	public static void main(String[] args) {
		
		MainProject obj1=new MainProject();
		obj1.display();
		obj1.read();
		obj1.get();
		obj1.disp();
		// TODO Auto-generated method stub

	}
	public void display()
	{ System.out.println("HELLO PUBLIC");
	}

	private void read()
	{ System.out.println("HELLO PRIV");
	}
	
	protected void get()
	{ System.out.println("HELLO Protected");
	}

	void disp()
	{ System.out.println("HELLO default method");
	}
}
