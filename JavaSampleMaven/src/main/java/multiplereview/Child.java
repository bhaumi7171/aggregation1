package multiplereview;

public  class Child implements Parent,Inter {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

Child s=new Child();
s.display();
s.dis();


	}

	@Override
	public void display() {
		int e=a*b;
		System.out.println(e);
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dis() {
		System.out.println(d);
		// TODO Auto-generated method stub
		
	}

}
