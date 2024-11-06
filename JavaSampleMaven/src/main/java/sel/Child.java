package sel;

public class Child extends Parent {

	public Child(int a,int b)
	{
	super(a,b);
		this.a=a;
		this.b=b;
	
}
	public void sub()
	{
		int d=a-b;
		System.out.println("The sub of Numbers "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child s=new Child(40,50);
s.sub();
s.add();


	}

}
