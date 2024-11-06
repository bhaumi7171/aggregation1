package sel;

public class Parent {
	int a;
	int b;
	int c;
	public Parent(int a,int b)
	{
		this.a=a;
		this.b=b;
	
	}
	public void add()
	{
		c=a+b;
		System.out.println("The Addition of Two numbers "+c);
	}

}